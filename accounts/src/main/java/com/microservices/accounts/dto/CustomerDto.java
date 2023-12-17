package com.microservices.accounts.dto;

import lombok.Data;

import javax.validation.constraints.*;


@Data
public class CustomerDto {

    @NotEmpty(message = "Customer name can't be null")
    @Size(min = 5,max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email can't be null")
    @Email(message = "Should be a valid email")
    private String email;

    @Pattern(regexp = "^$|[0-9]{10}" , message = "Invalid mobile number")
    private String mobileNumber;

    private AccountsDto accountsDto;

}
