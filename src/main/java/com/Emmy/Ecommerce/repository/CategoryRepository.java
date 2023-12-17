package com.Emmy.Ecommerce.repository;

import com.Emmy.Ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
