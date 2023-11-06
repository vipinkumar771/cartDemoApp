package shoppingCart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingCart.demo.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
}
