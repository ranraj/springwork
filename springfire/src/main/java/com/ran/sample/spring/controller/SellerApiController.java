package com.ran.sample.spring.controller;

import com.ran.sample.spring.model.Seller;
import com.ran.sample.spring.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerApiController {

    @Autowired
    private SellerService sellerService;

    // Simple / means fetch all
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Seller> getAllOrder() {
        return sellerService.getAllSellers();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody Seller createSeller(@RequestBody Seller seller) {
        return sellerService.createSeller(seller);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public @ResponseBody List<Seller> getByName(@PathVariable String name) {
        return sellerService.getByName(name);
    }

    public SellerService getSellerService() {
        return sellerService;
    }

    public void setSellerService(SellerService sellerService) {
        this.sellerService = sellerService;
    }

}