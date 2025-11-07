package com.jasper.learn.mapper;

import com.jasper.learn.domain.entity.Invoice;
import com.jasper.learn.dto.request.invoice.InvoiceRequestDto;
import com.jasper.learn.dto.response.InvoiceResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {InvoiceItemMapper.class})
public interface InvoiceMapper {

    // Untuk Response (entity -> dto)
    @Mapping(target = "customerId", source = "customer.id")
    @Mapping(target = "customerName", source = "customer.name")
    @Mapping(target = "phoneNumber", source = "customer.phone")
    InvoiceResponseDto toResponse(Invoice invoice);

    // Untuk Request (dto -> entity)
    @Mapping(target = "customer", ignore = true) // akan di-set di service
    @Mapping(target = "items", source = "items")
    Invoice toEntity(InvoiceRequestDto request);
}