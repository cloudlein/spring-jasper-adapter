package com.jasper.learn.adapter.controller;


import com.jasper.learn.common.api.ApiResponse;
import com.jasper.learn.common.api.ApiResponseFactory;
import com.jasper.learn.domain.service.InvoiceService;
import com.jasper.learn.dto.request.invoice.InvoiceRequestDto;
import com.jasper.learn.dto.request.product.ProductRequestDto;
import com.jasper.learn.mapper.InvoiceMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/invoices")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;
    private final InvoiceMapper invoiceMapper;

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> create(@RequestBody @Valid InvoiceRequestDto requestDto) {
        invoiceService.create(invoiceMapper.toEntity(requestDto));
        return ApiResponseFactory.created("Product created successfully");
    }


}
