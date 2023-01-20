package org.example.product.application.controller;

import org.example.common.URI;
import org.example.product.application.dto.ProductRequest;
import org.example.product.application.service.ProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductApplicationService productApplicationService;

    @PostMapping(URI.POST_CREATE_PRODUCT)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productApplicationService.createProduct(productRequest);
    }
}
