package rikkeisoft.com.demo.repository.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkeisoft.com.demo.model.Categories;

public interface CategoriesRepository extends JpaRepository<Categories,Long> {



}
