package com.wanted.backend.cqrs_ecommerce_system.product.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "product_options")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_group_id")
    private ProductOptionGroup productOptionGroup;

    private String name;

    @Column(name = "additional_price")
    private BigDecimal additionalPrice;

    private String sku;

    private int stock;

    @Column(name = "display_order")
    private int displayOrder;
}
