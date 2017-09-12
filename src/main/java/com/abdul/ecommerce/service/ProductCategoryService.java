package com.abdul.ecommerce.service;

import com.abdul.ecommerce.api.dto.ProductCategoryDto;
import com.abdul.ecommerce.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategoryDto> getAllProductCategories();
    ProductCategory getProductCategoryByName(String name);
    void createProductCategory(ProductCategoryDto productCategory);
}
