package pl.edu.wszib.orders.api.product;

import pl.edu.wszib.orders.api.order.OrderApi;
import pl.edu.wszib.orders.api.order.OrderError;

public interface ProductResult {

    ProductApi success();

    ProductError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default  boolean isError(){
        return !isSuccess();
    }
}
