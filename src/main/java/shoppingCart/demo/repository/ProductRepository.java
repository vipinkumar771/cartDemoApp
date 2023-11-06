package shoppingCart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingCart.demo.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
}
