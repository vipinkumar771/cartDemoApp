package shoppingCart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingCart.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
