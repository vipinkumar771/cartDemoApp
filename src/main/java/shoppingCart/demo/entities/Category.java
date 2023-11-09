package shoppingCart.demo.entities;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private int id;
    private String name;

}
