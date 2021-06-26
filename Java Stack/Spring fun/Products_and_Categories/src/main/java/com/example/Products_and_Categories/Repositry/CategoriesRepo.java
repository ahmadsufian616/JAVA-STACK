package com.example.Products_and_Categories.Repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Products_and_Categories.Model.Categories;
import com.example.Products_and_Categories.Model.Product;

@Repository
public interface CategoriesRepo extends CrudRepository<Categories, Long> {
	
	List<Categories> findAll();
	Categories findCategoryById(Long id);
    List<Categories> findByProductsNotContains(Product p);
    List<Categories> findByProductsContains(Product p);

}
