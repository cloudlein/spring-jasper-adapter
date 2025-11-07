package com.jasper.learn.adapter.repository.invoiceitem;

import com.jasper.learn.domain.entity.InvoiceItem;
import com.jasper.learn.domain.repository.InvoiceItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class InvoiceItemRepositoryAdapter implements InvoiceItemRepository {

    private final JpaInvoiceItemRepository jpaInvoiceItem;

    @Override
    public Optional<InvoiceItem> findById(Long id) {
        return jpaInvoiceItem.findById(id);
    }

    @Override
    public InvoiceItem save(InvoiceItem invoiceItem) {
        return jpaInvoiceItem.save(invoiceItem);
    }

    @Override
    public void deleteInvoiceItem(InvoiceItem invoiceItem) {
        jpaInvoiceItem.delete(invoiceItem);
    }

    @Override
    public Page<InvoiceItem> findAll(Pageable pageable) {
        return jpaInvoiceItem.findAll(pageable);
    }
}
