package com.wanted.backend.cqrs_ecommerce_system.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pagination {
    private long totalItems;
    private int totalPages;
    private int currentPage;
    private int perPage;
}