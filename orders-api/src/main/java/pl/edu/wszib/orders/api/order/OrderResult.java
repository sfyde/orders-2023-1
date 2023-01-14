package pl.edu.wszib.orders.api.order;

public interface OrderResult {
    OrderApi success();
    OrderError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }
}
