package com.jasper.learn.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class InvoiceItemResponseDto {

    private Long id;
    private Long invoiceId;
    private Long productId;
    private String code;
    private String productName;
    private String category;
    private String unit;
    private Integer quantity;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
