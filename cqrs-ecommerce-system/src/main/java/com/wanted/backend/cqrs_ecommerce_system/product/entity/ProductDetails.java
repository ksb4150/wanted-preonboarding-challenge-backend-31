package com.wanted.backend.cqrs_ecommerce_system.product.entity;

import com.wanted.backend.cqrs_ecommerce_system.common.dto.JsonToMapConverter;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;

@Entity
@Table(name = "product_details")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_id", unique = true)
    private Product product;

    private BigDecimal weight;

    @Convert(converter = JsonToMapConverter.class)
    private Map<String, Object> dimensions;

    private String materials;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    @Column(name = "warranty_info")
    private String warrantyInfo;

    @Column(name = "care_instructions")
    private String careInstructions;

    @Convert(converter = JsonToMapConverter.class)
    @Column(name = "additional_info")
    private Map<String, Object> additionalInfo;


}
