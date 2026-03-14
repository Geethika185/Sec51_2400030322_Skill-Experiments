package com.klu.repo;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import com.klu.model.Product;

public interface ProductRepo extends JpaRepository<Product,Long>
{

    // Price Ascending
    @Query("from Product order by price asc")
    List<Product> sortPriceAsc();

    // Price Descending
    @Query("from Product order by price desc")
    List<Product> sortPriceDesc();

    // Quantity Highest
    @Query("from Product order by quantity desc")
    List<Product> sortByQuantity();

    // Pagination
    @Query(value="select * from product limit 3", nativeQuery=true)
    List<Product> first3();

    @Query(value="select * from product limit 3 offset 3", nativeQuery=true)
    List<Product> next3();
}