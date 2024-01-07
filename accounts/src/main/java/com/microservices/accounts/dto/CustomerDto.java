package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
@Schema(name = "Customer",
description = "Schema to hold customer and account details")
public class CustomerDto {

    @Schema(
            description = "Customer Name",example = "Prashant Malhotra"
    )
    @NotEmpty(message = "Customer name can't be null")
    @Size(min = 5,max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of Customer",example = "prashant462@gmail.com"
    )
    @NotEmpty(message = "Email can't be null")
    @Email(message = "Should be a valid email")
    private String email;

    @Schema(
            description = "Customer Mobile Number",example = "9892598765"
    )
    @Pattern(regexp = "^$|[0-9]{10}" , message = "Invalid mobile number")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;

}
