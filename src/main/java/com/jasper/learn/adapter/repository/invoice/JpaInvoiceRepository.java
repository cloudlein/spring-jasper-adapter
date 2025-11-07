package com.jasper.learn.adapter.repository.invoice;

import com.jasper.learn.domain.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaInvoiceRepository extends JpaRepository<Invoice, Long> {
}
