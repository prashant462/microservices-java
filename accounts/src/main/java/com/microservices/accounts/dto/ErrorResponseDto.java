package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error Code representing the error",example = "401 BAD REQUEST"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message representing the error",example = "Internal Server Error"
    )
    private String errorMsg;

    @Schema(
            description = "Time of the error",example = "12:30"
    )
    private LocalDateTime errorTime;
}
