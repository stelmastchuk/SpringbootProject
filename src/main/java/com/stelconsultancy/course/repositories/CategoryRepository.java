package com.stelconsultancy.course.repositories;

import com.stelconsultancy.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
