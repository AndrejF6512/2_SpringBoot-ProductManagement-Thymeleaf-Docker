package com.foltan.springbootproductthymeleaf.repository;

import com.foltan.springbootproductthymeleaf.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
