package com.wanted.backend.cqrs_ecommerce_system.common.exception;

import lombok.Getter;
import java.util.Map;

@Getter
public class BusinessException extends RuntimeException {
    private final ErrorCode errorCode;
    private final Map<String, Object> details;

    public BusinessException(ErrorCode errorCode) {
        this(errorCode, null);
    }

    public BusinessException(ErrorCode errorCode, Map<String, Object> details) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.details = details;
    }
}