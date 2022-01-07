package rikkeisoft.com.demo.repository.orderdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.model.OrderDetails;

import java.util.Optional;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {

//    @Query(value = "select o.id, o.create_at, o.total, o.user_id, o.status, od.product_id "
//            + "from order_details od "
//            + "join orders o on od.order_id = o.id "
//            + "where od.product_id = :id", nativeQuery = true)
//    Optional<OrderDetails> findById(@Param("id") Integer id);

    @Query(value = "update OrderDetails o  set o.quantity = :qtt, o.price = :pr where o.id =:id")
    void updateOderDetails(@Param("qtt") Integer id, Integer qtt, Float pr);
}
