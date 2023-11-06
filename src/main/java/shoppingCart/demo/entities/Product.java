package shoppingCart.demo.entities;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Component
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
