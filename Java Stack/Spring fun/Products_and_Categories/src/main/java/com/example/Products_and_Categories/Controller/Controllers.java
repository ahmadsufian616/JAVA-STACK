package com.example.Products_and_Categories.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Products_and_Categories.Model.Categories;
import com.example.Products_and_Categories.Model.CategoryProduct;
import com.example.Products_and_Categories.Model.Product;
import com.example.Products_and_Categories.Servises.Serviceall;

@Controller
public class Controllers {
private final Serviceall S;

public Controllers(Serviceall s) {
	super();
	S = s;
}

@RequestMapping("/")
public String indexproduct(@ModelAttribute("product")Product product ) {
	return"ProductsNew.jsp";
}
@RequestMapping(value="/addproduct",method=RequestMethod.POST)
public String Addproduct(@ModelAttribute("product")Product product) {
	S.createProduct(product);
	return"redirect:/";
}
@RequestMapping("/	")
public String indexCate(@ModelAttribute("Cate")Categories categories ) {
	return"CateNew.jsp";
}
@RequestMapping(value="/addCate",method=RequestMethod.POST)
public String Addproduct(@ModelAttribute("Cate")Categories categories) {
	S.createCategories(categories);
	return"redirect:/Cate";
}

@RequestMapping("/products/{id}")
public String showProCat(@PathVariable("id") Long proId, @ModelAttribute("categoryProductObj") CategoryProduct catPro, Model model) {
    Product p = S.getProduct(proId);
    model.addAttribute("product", p);

    List<Categories> catAssociate = S.categoriesAssociated(p);
    model.addAttribute("categoriesAdded", catAssociate);

    List<Categories> cn = S.categoriesNotAssociated(p);
    model.addAttribute("categoriesNotAdded", cn);

    return "showProduct.jsp";
    //Category categoryAdded=proCatServ.CategoryNotAdded();
}
@RequestMapping(value="/associate/{id}", method = RequestMethod.POST)
public String associateCategory(@PathVariable("id") Product proId, @ModelAttribute("categoryProductObj") CategoryProduct catPro) {
    S.createAssociation(catPro);
    return "redirect:/products/{id}";
}

}










