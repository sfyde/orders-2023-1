package pl.edu.wszib.orders.api;

// TODO task 2: add limitation to TSuccess parameter type to extend ApiSuccess
public interface ApiResult<TSuccess, TError extends Enum<?>> {

    TSuccess success();

    TError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }
}
