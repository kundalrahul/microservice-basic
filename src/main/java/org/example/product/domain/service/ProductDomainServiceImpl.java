package org.example.product.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.example.product.application.dto.ProductRequest;
import org.example.product.domain.entity.Product;
import org.example.product.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductDomainServiceImpl implements ProductDomainService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {

        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());

    }


}
