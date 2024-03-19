package io.github.oengajohn.productservice.service;

import java.util.List;

import io.github.oengajohn.productservice.model.ProductCreateRequest;
import io.github.oengajohn.productservice.model.ProductCreateResponse;

public interface ProductService {

    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);

    List<ProductCreateResponse> findAll();

    ProductCreateResponse findById(Integer productId);
    
}
