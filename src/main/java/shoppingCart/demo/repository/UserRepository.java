package shoppingCart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingCart.demo.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);
}
