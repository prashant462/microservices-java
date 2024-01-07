package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(name = "Accounts",
description = "Holding Account Details")
public class AccountsDto {

    @Schema(
            description = "Account Number of Eazy Bank Account"
    )
    @Pattern(regexp = "^$|[0-9]{10}",message = "Account number can only be of 10 digits")
    @NotEmpty(message = "Account number can not be empty")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Eazy Bank Account",example = "SAVING"
    )
    @NotEmpty(message = "Account type can't be null or empty")
    private String accountType;

    @Schema(
            description = "Bank Brank Address of Eazy Bank Account"
    )
    @NotEmpty(message = "Branch Address can't be a null or empty value")
    private String branchAddress;

}
