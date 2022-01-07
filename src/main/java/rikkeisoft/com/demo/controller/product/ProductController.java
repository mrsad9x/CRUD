package rikkeisoft.com.demo.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rikkeisoft.com.demo.model.Product;
import rikkeisoft.com.demo.service.produc.ProductService;

import java.util.*;

@Controller
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService productService;
    
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public ResponseEntity<String> home(){

        return new ResponseEntity<>("Welcome to java K2", HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> productList = new ArrayList<>();
        productList = productService.findAllProduct();
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }
    @PostMapping("/products")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<String>("product add oki", HttpStatus.OK);
    }
    @DeleteMapping("/products")
    public ResponseEntity<String> deleteProduct(@RequestParam Long id){

        productService.deleteProduct( id);
        return new ResponseEntity<String>("product: "+ id + " delete oki", HttpStatus.OK);
    }
    @PutMapping("/products")
    public ResponseEntity<String> deleteProduct(@RequestParam String str){

        productService.updateProduct( str);
        return new ResponseEntity<String>("product name add: "+ str + " oki", HttpStatus.OK);
    }


}
