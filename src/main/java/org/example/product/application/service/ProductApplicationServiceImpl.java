package org.example.product.application.service;

import org.example.product.application.dto.ProductRequest;
import org.example.product.domain.entity.Product;
import org.example.product.domain.service.ProductDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductApplicationServiceImpl implements ProductApplicationService {

    @Autowired
    private ProductDomainService productDomainService;


    @Override
    public void createProduct(ProductRequest productRequest) {
        productDomainService.createProduct(productRequest);
    }
}
