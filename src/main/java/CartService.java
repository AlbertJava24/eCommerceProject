import org.apache.catalina.User;

public interface CartService {

    void addToCart(Long productId, User user);

    void removeFromCart(Long productId, User user);
}