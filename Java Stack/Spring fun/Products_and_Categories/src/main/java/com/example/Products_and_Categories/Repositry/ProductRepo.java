package com.example.Products_and_Categories.Repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Products_and_Categories.Model.Categories;
import com.example.Products_and_Categories.Model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long>  {
	
	List<Product> findAll();
	Product findProductById(Long id);
	List<Product>findByCategoriesContains(Categories c);
    
	List<Product> findByCategoriesNotContains(Categories c);
}
