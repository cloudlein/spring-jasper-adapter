package com.jasper.learn.domain.repository;

import com.jasper.learn.domain.entity.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface InvoiceRepository {

    Optional<Invoice> findById(Long id);

    Invoice save(Invoice invoice);

    void deleteInvoice(Invoice invoice);

    Page<Invoice> findAll(Pageable pageable);

}
