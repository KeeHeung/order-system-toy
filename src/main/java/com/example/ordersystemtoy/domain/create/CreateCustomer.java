package com.example.ordersystemtoy.domain.create;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {
    private final String name;
    private final String address;
    private final String phoneNumber;

    public static CreateCustomer ofDefault() {
        return CreateCustomer.builder()
                .name("danny.kim")
                .address("서울")
                .phoneNumber("010-1234-5678")
                .build();
    }
}