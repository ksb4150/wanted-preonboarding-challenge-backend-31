package com.wanted.backend.cqrs_ecommerce_system.common.dto;

import com.wanted.backend.cqrs_ecommerce_system.common.exception.ErrorCode;
import lombok.Getter;

import java.util.Map;

@Getter
public class ApiResponse<T> {
    private final boolean success;
    private final T data;
    private final String message;
    private final ErrorResponse error;

    public ApiResponse(T data, String message) {
        this.success = true;
        this.data = data;
        this.message = message;
        this.error = null;
    }

    public ApiResponse(ErrorResponse error) {
        this.success = false;
        this.data = null;
        this.message = null;
        this.error = error;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(data, "요청이 성공적으로 처리되었습니다.");
    }

    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(data, message);
    }

    public static <T> ApiResponse<T> error(ErrorCode errorCode) {
        return new ApiResponse<>(new ErrorResponse(errorCode));
    }

    public static <T> ApiResponse<T> error(ErrorCode errorCode, Map<String, String> details) {
        return new ApiResponse<>(new ErrorResponse(errorCode, details));
    }
}