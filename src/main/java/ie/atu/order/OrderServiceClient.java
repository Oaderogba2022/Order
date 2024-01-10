package ie.atu.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-service", url = "http://localhost:8081")
public interface OrderServiceClient {
    @PostMapping("/orders/create")
    void createOrder(@RequestBody Order order);

}
