package ie.atu.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderServiceClient orderServiceClient; // Feign client for communication

    // Create order using Feign client
    public void createOrder(Order order) {
        orderServiceClient.createOrder(order);
    }
}
