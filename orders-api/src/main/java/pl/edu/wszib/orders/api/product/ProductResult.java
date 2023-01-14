package pl.edu.wszib.orders.api.product;


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
