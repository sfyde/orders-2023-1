package pl.edu.wszib.orders.application;

import pl.edu.wszib.orders.api.order.OrderFacadeApi;
import pl.edu.wszib.orders.api.order.OrderResult;

public class OrderFacade implements OrderFacadeApi {
    @Override
    public OrderResult create() {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult getById(String orderId) {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult addProduct(
            String orderId,
            String productId) {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult removeProduct(
            String orderId,
            String productId) {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult increaseProduct(
            String orderId,
            String productId) {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult decreaseProduct(
            String orderId,
            String productId) {
        throw new IllegalStateException("Not implemented!");
    }

    @Override
    public OrderResult setProductQuantity(
            String orderId,
            String productId,
            Integer quantity) {
        throw new IllegalStateException("Not implemented!");
    }
}
