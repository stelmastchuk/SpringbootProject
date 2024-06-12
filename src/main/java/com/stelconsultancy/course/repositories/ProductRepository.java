package com.stelconsultancy.course.repositories;

import com.stelconsultancy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
