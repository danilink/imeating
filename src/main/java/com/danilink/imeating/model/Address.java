package com.danilink.imeating.model;

import lombok.Data;

/**
 * 
 * @author Danilink
 * @version 1.0
 * @since 13 feb. 2017
 */
public @Data class Address {
    private String addressline1;
    private String addressline2;
    private String summaryline;
    private String postcode;
    private String street;  
}
