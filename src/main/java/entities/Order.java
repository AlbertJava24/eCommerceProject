package entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;

    @Column
    private String productName;

    // Add more product attributes as needed

    @ManyToOne
    @JoinColumn(name = "order_id")  // This establishes the relationship with Order entity
    private Order order;

    // Constructors, getters, setters, etc.
}
