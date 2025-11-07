package com.jasper.learn.dto.request.invoice;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceRequestDto {

    @NotBlank(message = "Invoice number cannot be empty")
    private String invoiceNumber;

    @NotNull(message = "Invoice date cannot be empty")
    private LocalDate invoiceDate;

    private LocalDate dueDate;

    @NotNull(message = "Invoice item cannot be null")
    private List<@Valid InvoiceItemRequestDto> items;

}
