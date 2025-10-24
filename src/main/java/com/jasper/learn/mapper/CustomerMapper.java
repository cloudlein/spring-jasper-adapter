package com.jasper.learn.mapper;

import com.jasper.learn.domain.entity.Customer;
import com.jasper.learn.dto.request.CustomerRequestDto;
import com.jasper.learn.dto.response.CustomerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    // --- Mapping for Response ---
    CustomerResponseDto toDto(Customer customer); // Domain → Response DTO

    // --- Mapping for Request ---
    Customer toDomain(CustomerRequestDto request); // Request DTO → Domain

    // --- Mapping for Entity ---
    Customer toEntity(Customer customer); // Domain → Entity
    Customer toDomain(Customer entity);   // Entity → Domain
}
