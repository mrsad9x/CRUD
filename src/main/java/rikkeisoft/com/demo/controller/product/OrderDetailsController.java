package rikkeisoft.com.demo.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rikkeisoft.com.demo.model.OrderDetails;
import rikkeisoft.com.demo.service.orderdetails.OrderDetailsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/oddts")
    public ResponseEntity<List<OrderDetails>> getAllOrderDetails(){
        List<OrderDetails> orderDetails = new ArrayList<>();
        orderDetails = orderDetailsService.findAllOrderDetails();
        return new ResponseEntity<List<OrderDetails>>(orderDetails, HttpStatus.OK);
    }
//    @GetMapping("/oddts/{id}")
//    public ResponseEntity<Optional<OrderDetails>> getOrderDetails(@RequestParam Integer id){
//        OrderDetails orderDetails = new OrderDetails();
//        orderDetails = orderDetailsService.findOrderDetails();
//        return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.OK);
//    }
    @PostMapping("/oddts")
    public ResponseEntity<String> addOrderDetails(@RequestBody OrderDetails orderDetails){
        orderDetailsService.addOdDetails(orderDetails);
        return new ResponseEntity<String>("add successfully",HttpStatus.OK);
    }
    @DeleteMapping("/oddts")
    public ResponseEntity<String> deletedOrderDetails(@RequestParam Integer id){
        orderDetailsService.deleteOdDetails(id);
        return new ResponseEntity<String>("OrderDetails " + id + " deleted",HttpStatus.OK);
    }
    @PutMapping("/oddts")
    public ResponseEntity<String> updateOrderDetails(@RequestParam Integer id, Integer qtt, Float pr){
        orderDetailsService.updateOdDetails(id,qtt,pr);
        return new ResponseEntity<String>("update successfully",HttpStatus.OK);
    }
}

