package com.danilink.imeating.model;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @version 1.0
 * @since 23 feb. 2017
 */
@Data
public class Comment {
    
    private String author;
    private String body;
    private String title;
    private Date date;
}
