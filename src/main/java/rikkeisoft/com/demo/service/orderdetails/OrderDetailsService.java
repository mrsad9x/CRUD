package rikkeisoft.com.demo.service.orderdetails;

import rikkeisoft.com.demo.model.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetails> findAllOrderDetails();
    OrderDetails findOrderDetails(Integer id);
    void addOdDetails(OrderDetails orderDetails);
    void deleteOdDetails(Integer id);
    void updateOdDetails(Integer id, Integer qtt, Float pr);

}
