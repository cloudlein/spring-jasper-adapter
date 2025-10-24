package com.jasper.learn.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRequestDto {

    private String name;
    private String address;
    private String phone;

}
