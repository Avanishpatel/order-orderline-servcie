package com.solstice.orderorderlineservice.feignClient;

import com.solstice.orderorderlineservice.domain.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "shipment-service", url = "http://shipment-service-zany-emu.cfapps.io")
public interface ShipmentClient {

    @RequestMapping(path = "/shipments/{id}", method = RequestMethod.GET)
    Shipment getShipment(@PathVariable("id") long id);
}
