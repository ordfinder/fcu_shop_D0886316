package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.Product;
import fcu.sep.fcushop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService productManager;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productManager.getProducts();
    }

    //GetMapping get String keyword(search)
    @GetMapping("/products/{keyword}")
    public List<Product> getProducts(@PathVariable("keyword") String keyword) {
        return productManager.getProducts(keyword);
    }
}