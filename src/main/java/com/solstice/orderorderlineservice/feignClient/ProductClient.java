package com.solstice.orderorderlineservice.feignClient;

import com.solstice.orderorderlineservice.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("product-service")
public interface ProductClient {

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    Product getProductById(@PathVariable("id") Long id);
}
