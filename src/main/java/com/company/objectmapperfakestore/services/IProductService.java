package com.company.objectmapperfakestore.services;

import com.company.objectmapperfakestore.models.Product;

public interface IProductService {

    Product getProductById(Long productId);
}
