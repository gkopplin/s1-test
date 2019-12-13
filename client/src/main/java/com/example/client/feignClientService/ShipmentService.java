package com.example.client.feignClientService;

import com.example.client.model.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="shipments")
public interface ShipmentService {

    @GetMapping("/shipment/{trackingNumber}")
    public Shipment getShipment(@PathVariable long trackingNumber);

    @PostMapping("/shipment/addshipment")
    public Shipment createShipment(@RequestBody Shipment shipment);
}
