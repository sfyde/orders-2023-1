package pl.edu.wszib.orders.api.product;

import java.math.BigDecimal;

public interface ProductApi extends ProductCreateApi {
    String id();

    @Override
    String name();

    @Override
    BigDecimal price();
}
