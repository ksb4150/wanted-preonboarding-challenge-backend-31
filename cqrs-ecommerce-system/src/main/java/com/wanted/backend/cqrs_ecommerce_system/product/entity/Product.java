package com.wanted.backend.cqrs_ecommerce_system.product.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String slug;

    @Column(name = "short_description", nullable = false)
    private String shortDescription;

    @Column(name = "full_description", nullable = false)
    private String fullDescription;

    @Column(name = "seller_id", nullable = false)
    private int sellerId;

    @Column(name = "brand_id", nullable = false)
    private int brandId;

    private String status;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
