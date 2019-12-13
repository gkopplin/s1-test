package com.example.client.controller;


import com.example.client.feignClientService.ShipmentService;
import com.example.client.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientfe")
public class ClientController {

    @Autowired
    ShipmentService shipmentService;

    @GetMapping("/shipment/{trackingNumber}")
    public Shipment getShipment(@PathVariable Long trackingNumber){
        return shipmentService.getShipment(trackingNumber);
    }
    @PostMapping("/shipment/addshipment")
    public Shipment createShipment(@RequestBody Shipment shipment){
        return shipmentService.createShipment(shipment);
    }
}
