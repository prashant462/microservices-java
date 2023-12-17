package com.microservices.accounts.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class AccountsDto {

    @Pattern(regexp = "^$|[0-9]{10}",message = "Account number can only be of 10 digits")
    @NotEmpty(message = "Account number can not be empty")
    private Long accountNumber;

    @NotEmpty(message = "Account type can't be null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can't be a null or empty value")
    private String branchAddress;

}
