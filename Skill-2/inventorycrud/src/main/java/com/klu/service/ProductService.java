package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.entity.Product;
import com.klu.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product update(Long id, Product updatedProduct) {
        Product product = repository.findById(id).orElse(null);
        if (product != null) {
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            return repository.save(product);
        }
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}