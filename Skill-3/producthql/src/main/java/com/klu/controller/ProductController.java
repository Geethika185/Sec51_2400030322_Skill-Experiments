package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Product;
import com.klu.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/priceasc")
    public List<Product> priceAsc()
    {
        return service.priceAsc();
    }

    @GetMapping("/pricedesc")
    public List<Product> priceDesc()
    {
        return service.priceDesc();
    }

    @GetMapping("/quantity")
    public List<Product> quantityHigh()
    {
        return service.quantityHigh();
    }

    // Pagination APIs

    @GetMapping("/first3")
    public List<Product> first3()
    {
        return service.first3();
    }

    @GetMapping("/next3")
    public List<Product> next3()
    {
        return service.next3();
    }

}