package com.jasper.learn.domain.service;

import com.jasper.learn.domain.entity.Invoice;
import org.springframework.data.domain.Page;

public interface InvoiceService {

    void create (Invoice invoice);
    Invoice getById(Long id);
    void update(Long id, Invoice invoice);
    Page<Invoice> findAll(int page, int size);
    void delete(Long id);

}
