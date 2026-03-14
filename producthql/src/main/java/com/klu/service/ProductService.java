package com.klu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import com.klu.model.Product;
import com.klu.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> priceAsc()
    {
        return repo.sortPriceAsc();
    }

    public List<Product> priceDesc()
    {
        return repo.sortPriceDesc();
    }

    public List<Product> quantityHigh()
    {
        return repo.sortByQuantity();
    }

    // Pagination - First 3 products
    public List<Product> firstThreeProducts()
    {
        return repo.findAll(PageRequest.of(0,3)).getContent();
    }

    // Pagination - Next 3 products
    public List<Product> nextThreeProducts()
    {
        return repo.findAll(PageRequest.of(1,3)).getContent();
    }

	public List<Product> first3() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> next3() {
		// TODO Auto-generated method stub
		return null;
	}

}