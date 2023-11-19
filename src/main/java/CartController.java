import entities.Product;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private List<Product> productList = createProductList();

    @PostMapping("/add/{productId}")
    public void addToCart(@PathVariable Long productId, @RequestBody User user) {
        Product productToAdd = getProductById(productId);

        // Add your logic to handle adding the product to the user's cart
        // ...

        System.out.println("Added product to cart: " + productToAdd.getName());
    }

    @DeleteMapping("/remove/{productId}")
    public void removeFromCart(@PathVariable Long productId, @RequestBody User user) {
        Product productToRemove = getProductById(productId);

        // Add your logic to handle removing the product from the user's cart
        // ...

        System.out.println("Removed product from cart: " + productToRemove.getName());
    }

    private List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "Product A", 1));
        productList.add(new Product(2L, "Product B", 29.99));
        // Add more products as needed
        return productList;
    }

    private Product getProductById(Long productId) {
        // This is a simple example; in a real application, you would retrieve the product from a database
        return productList.stream()
                .filter(product -> product.getId().equals(productId))
                .findFirst()
                .orElse(null);
    }
}