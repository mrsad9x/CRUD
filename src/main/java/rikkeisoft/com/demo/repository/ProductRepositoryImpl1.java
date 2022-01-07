package rikkeisoft.com.demo.repository;

import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl1 {
    private List<Product> productList = new ArrayList<>();

    public List<Product> findAll(){
        Product product = new Product(1l,"laptop Dell",new BigDecimal(1500000));
        Product product1 = new Product(2l,"laptop Dell 1",new BigDecimal(1500000));
        Product product2 = new Product(3l,"laptop Dell 2",new BigDecimal(1600000));
        Product product3 = new Product(4l,"laptop Dell 3",new BigDecimal(1700000));
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return  productList;
    }
}
