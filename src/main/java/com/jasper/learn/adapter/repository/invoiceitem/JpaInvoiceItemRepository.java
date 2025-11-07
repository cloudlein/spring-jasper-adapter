package com.jasper.learn.adapter.repository.invoiceitem;

import com.jasper.learn.domain.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaInvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}
