package shoppingCart.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
