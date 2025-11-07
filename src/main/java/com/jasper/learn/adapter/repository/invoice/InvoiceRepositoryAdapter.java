package com.jasper.learn.adapter.repository.invoice;

import com.jasper.learn.domain.entity.Invoice;
import com.jasper.learn.domain.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class InvoiceRepositoryAdapter implements InvoiceRepository {

    private final JpaInvoiceRepository jpaInvoice;

    @Override
    public Optional<Invoice> findById(Long id) {
        return jpaInvoice.findById(id);
    }

    @Override
    public Invoice save(Invoice invoice) {
        return jpaInvoice.save(invoice);
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        jpaInvoice.delete(invoice);
    }

    @Override
    public Page<Invoice> findAll(Pageable pageable) {
        return jpaInvoice.findAll(pageable);
    }
}
