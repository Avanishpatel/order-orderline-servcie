package com.solstice.orderorderlineservice.feignClient;

import com.solstice.orderorderlineservice.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("account-address-service")
public interface AddressClient {

    @RequestMapping(path = "/addresses/{id}", method = RequestMethod.GET)
    Address getAddressById(@PathVariable("id") long id);

}
