package com.wanted.backend.cqrs_ecommerce_system.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PagedResponse<T> {
    private List<T> items;
    private Pagination pagination;
}