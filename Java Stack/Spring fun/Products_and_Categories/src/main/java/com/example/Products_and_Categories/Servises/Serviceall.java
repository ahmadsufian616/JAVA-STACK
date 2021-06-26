package com.example.Products_and_Categories.Servises;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Products_and_Categories.Model.Categories;
import com.example.Products_and_Categories.Model.CategoryProduct;
import com.example.Products_and_Categories.Model.Product;
import com.example.Products_and_Categories.Repositry.CategoriesRepo;
import com.example.Products_and_Categories.Repositry.CategoryProductRepo;
import com.example.Products_and_Categories.Repositry.ProductRepo;

@Service 
public class Serviceall {
	private final ProductRepo PR;
	private final CategoriesRepo CR;
	private final CategoryProductRepo PCR;
	
	
	public Serviceall(ProductRepo pR, CategoriesRepo cR, CategoryProductRepo pCR) {
	
		PR = pR;
		CR = cR;
		PCR = pCR;
	}

	public List<Product> findAllProduct(){
		
		return PR.findAll();
		
	}
	
public List<Categories> findAllCategories(){
		
		return CR.findAll();
		
	}
public 	Product createProduct(Product p) {
	return PR.save(p);
}
public 	Categories createCategories(Categories c) {
	return CR.save(c);
}
public Product getProduct(Long id){

    return PR.findProductById(id);   
 
}
public List<Categories>categoriesAssociated(Product p){
    return CR.findByProductsContains(p);
}
public List<Categories> categoriesNotAssociated(Product p){
    return CR.findByProductsNotContains(p);
}

public List<Product> productAssociate(Categories c){
    return PR.findByCategoriesContains(c);
}

public List<Product> productNotAssociate(Categories c){
    return PR.findByCategoriesNotContains(c);
}

public CategoryProduct createAssociation(CategoryProduct cp){

     return PCR.save(cp);
}
}




