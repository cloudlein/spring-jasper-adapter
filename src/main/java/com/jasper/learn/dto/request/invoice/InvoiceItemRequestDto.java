package com.jasper.learn.dto.request.invoice;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceItemRequestDto {

    @NotNull(message = "Product id cannot be empty")
    private Long productId;

    @NotNull(message = "Quantity cannot be empty")
    private Integer quantity;

}
