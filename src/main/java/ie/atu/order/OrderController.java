package ie.atu.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderServiceClient orderServiceClient;

    @PostMapping("/orders/create")
    public String createOrder(@RequestBody Order order) {
        orderServiceClient.createOrder(order);
        return "Order created successfully: Order ID - " + order.getOrderId() + ", Product ID - " + order.getProductId();
    }

}
