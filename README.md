# orders-2023-1

## Technology:

- Maven 3.8.1
- Java 17

## Versioning

Using `${revision}` mechanism https://maven.apache.org/maven-ci-friendly.html

## Modules:

- api (orders-api) - data structures (java records), public interfaces
- application (orders-application) - domain logic implementation
- infrastructure (orders-infrastructure) - infrastructure implementation details required by domain (by application module)

## Domain

### Contexs

- order
- product

### Functionalities

#### 1. Order (interface pl.edu.wszib.orders.api.order.OrderFacadeApi)

    - create order
    - add product
    - increase/decrease/set quantity
    - remove product
    - search/get product

#### 2. Product (interface pl.edu.wszib.orders.api.product.ProductFacadeApi)

    -create product
    -search/get product

### Data Structure

#### Order
    -id (uuid)
    -items
    -amount
#### Order Item
    -(order_id)
    -product
    -quantity
    -amount
#### Product
    -id(uiid)
    -name
    -pirce