package org.example.product.domain.service;

import org.example.product.application.dto.ProductRequest;

public interface ProductDomainService {
    void createProduct(ProductRequest productRequest);
}
