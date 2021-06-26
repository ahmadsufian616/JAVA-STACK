package com.example.Products_and_Categories.Repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.Products_and_Categories.Model.CategoryProduct;

public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long>{

}
