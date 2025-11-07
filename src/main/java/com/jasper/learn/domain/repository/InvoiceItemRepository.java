package com.jasper.learn.domain.repository;

import com.jasper.learn.domain.entity.InvoiceItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface InvoiceItemRepository {

    Optional<InvoiceItem> findById(Long id);

    InvoiceItem save(InvoiceItem invoiceItem);

    void deleteInvoiceItem(InvoiceItem invoiceItem);

    Page<InvoiceItem> findAll(Pageable pageable);


}
