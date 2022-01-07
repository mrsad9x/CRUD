package rikkeisoft.com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeisoft.com.demo.model.OrderDetails;
import rikkeisoft.com.demo.repository.orderdetails.OrderDetailsRepository;
import rikkeisoft.com.demo.service.orderdetails.OrderDetailsService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Override
    public List<OrderDetails> findAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public OrderDetails findOrderDetails(Integer id) {
        return null;
    }

//    @Override
//    public OrderDetails findOrderDetails(Integer id) {
//        return orderDetailsRepository.findById();
//    }


    @Override
    public void addOdDetails(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void deleteOdDetails(Integer id) {
        orderDetailsRepository.deleteById(id);
    }

    @Override
    public void updateOdDetails(Integer id, Integer qtt, Float pr) {
        orderDetailsRepository.updateOderDetails(id,qtt,pr);
    }
}
