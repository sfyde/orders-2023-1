package pl.edu.wszib.orders.api.order;

public interface OrderFacadeApi {
    OrderResult create();

    OrderResult getById(String orderId);

    OrderResult addProduct(String orderId, String productId);

    OrderResult removeProduct(String orderId, String productId);

    OrderResult increaseProduct(String orderId, String productId);

    OrderResult decreaseProduct(String orderId, String productId);

    OrderResult setProductQuantity(String orderId, String productId, Integer quantity);
}
