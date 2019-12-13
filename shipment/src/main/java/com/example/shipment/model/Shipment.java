package com.example.shipment.model;

import javax.persistence.*;

@Entity
@Table(name = "shipments")
public class Shipment {
    @Column
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long trackingNumber;

    public Shipment() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
