package com.jasper.learn.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class InvoiceResponseDto {

    private Long id;
    private Long customerId;
    private String customerName;
    private String phoneNumber;
    private String invoiceNumber;
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private BigDecimal totalAmount;
    private List<InvoiceItemResponseDto> items;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
