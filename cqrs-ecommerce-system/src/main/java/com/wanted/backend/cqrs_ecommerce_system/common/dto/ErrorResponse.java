package com.wanted.backend.cqrs_ecommerce_system.common.dto;

import com.wanted.backend.cqrs_ecommerce_system.common.exception.ErrorCode;
import lombok.Getter;

import java.util.Map;

@Getter
public class ErrorResponse {
    private final String code;
    private final String message;
    private final Map<String, String> details;

    public ErrorResponse(ErrorCode errorCode) {
        this.code = errorCode.name();
        this.message = errorCode.getMessage();
        this.details = null;
    }

    public ErrorResponse(ErrorCode errorCode, Map<String, String> details) {
        this.code = errorCode.name();
        this.message = errorCode.getMessage();
        this.details = details;
    }
}
