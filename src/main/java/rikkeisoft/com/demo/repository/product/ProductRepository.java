package rikkeisoft.com.demo.repository.product;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.dto.ProductCTMDTO;
import rikkeisoft.com.demo.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
//    List<Product> findAll();
//    @Query(value = "Select p from Product p where p.id=:id")
//    Product getById(@Param("id") Long id);
//
//    List<Product> findAllByIdIn(List<Long> ids);
//
//    @Query(value = "select p from Product p where p.id in :ids")
//    List<Product> findAllProductsByIds(@Param("ids")List<Long> ids);

    @Query(value = "update Product p  set p.name = concat( p.name , :str) where p.id <> 0")
    void updateNameProduct(@Param("str") String str);

    @Query(value = "select new rikkeisoft.com.demo.dto.ProductCTMDTO(" +
            "p.id, p.name, p.price, c.name " +
            ") from Product p inner join Categories c on p.categoriesId = c.id")
    List<ProductCTMDTO> getListProduct();
}
