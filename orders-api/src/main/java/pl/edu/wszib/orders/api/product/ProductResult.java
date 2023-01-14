package pl.edu.wszib.orders.api.product;

public interface ProductResult {
    // TODO task 1: remove impl from here and use ApiResult (like in OrderResult)
    ProductApi success();

    ProductError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }
}
