package com.wanted.backend.cqrs_ecommerce_system.common.exception;

import java.util.Map;

public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;
    private final transient Map<String,String> details;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.details = null;
    }

    public CustomException(ErrorCode errorCode, Map<String, String> details) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.details = details;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Map<String, String> getDetails() {
        return details;
    }
}
