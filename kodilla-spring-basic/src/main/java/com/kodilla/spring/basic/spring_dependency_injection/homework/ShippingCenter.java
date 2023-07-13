package com.kodilla.spring.basic.spring_dependency_injection.homework;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {
    @Resource(name = "inPostDeliveryService")
    private DeliveryService deliveryService;

    @Resource(name = "inPostNotificationService")
    private NotificationService notificationService;


    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}