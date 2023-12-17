package com.Emmanuel.Ecommerce.repository;

import com.Emmanuel.Ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
