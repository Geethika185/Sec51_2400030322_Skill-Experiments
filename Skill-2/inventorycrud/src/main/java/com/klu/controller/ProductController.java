package com.klu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.entity.Product;
import com.klu.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,
                                 @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        service.delete(id);
        return "Product deleted successfully";
    }
}