package com.example.aviasales.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String card;
    private String paymentAccount;
}
