package pl.edu.wszib.orders.api.product;

public interface ProductFacadeApi {
    ProductResult create(ProductCreateApi productCreateApi);

    ProductResult getById(String id);
}
