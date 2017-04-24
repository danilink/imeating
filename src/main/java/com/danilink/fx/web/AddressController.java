package com.danilink.fx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.danilink.fx.model.Address;

/**
 * 
 * @author Danilink
 * @version 1.0
 * @since 13 feb. 2017
 */
@RestController
public class AddressController {
    
    private static final String URI = "http://ws.postcoder.com/pcw/PCW45-12345-12345-1234X/address/ie/";
   
    private RestTemplate restTemplate;

    @Autowired
    public AddressController(RestTemplate rt) {
        this.restTemplate = rt;
    }
    
    @GetMapping("api/{code}")
    public Address[] getAddresses(@PathVariable String code) {
        UriComponentsBuilder uriComponents = UriComponentsBuilder.fromHttpUrl(URI+code).cloneBuilder()
                .queryParam("lines", 3)
                .queryParam("format", "json");
        return restTemplate.getForObject(uriComponents.toUriString(), Address[].class, code);
    }
}
