package pl.edu.wszib.orders.api.product;

import pl.edu.wszib.orders.api.ApiSuccess;

import java.math.BigDecimal;

public interface ProductApi extends ProductCreateApi, ApiSuccess {
    String id();

    @Override
    String name();

    @Override
    BigDecimal price();
}
