package rikkeisoft.com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeisoft.com.demo.dto.ProductCTMDTO;
import rikkeisoft.com.demo.model.Product;
import rikkeisoft.com.demo.repository.ProductRepositoryImpl1;
import rikkeisoft.com.demo.repository.product.ProductRepository;
import rikkeisoft.com.demo.service.produc.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
    @Override
    public void addProduct( Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct( Long id) {
       productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(String str) {
        productRepository.updateNameProduct( str);
    }

    @Override
    public List<ProductCTMDTO> getListProduct() {
        return productRepository.getListProduct();
    }
}
