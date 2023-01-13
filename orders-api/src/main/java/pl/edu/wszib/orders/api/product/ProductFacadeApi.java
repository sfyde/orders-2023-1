package pl.edu.wszib.orders.api.product;

public interface ProductFacadeApi {

    ProductResult create (ProductCreateApi productCreate);

    ProductResult getById(String ProductId);
}
