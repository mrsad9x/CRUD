package rikkeisoft.com.demo.service.produc;

import rikkeisoft.com.demo.dto.ProducDTO;
import rikkeisoft.com.demo.dto.ProductCTMDTO;
import rikkeisoft.com.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    void addProduct( Product product);

     void deleteProduct( Long id);

    void updateProduct(String str);
    List<ProductCTMDTO>getListProduct();
}

