package com.danilink.fx.model;

import java.util.Date;

import lombok.Data;

/**
 *
**/
@Data
public class Posts {

    private String author;
    private String body;
    private String email;
    private Date date;
}
