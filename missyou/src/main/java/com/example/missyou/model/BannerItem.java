package com.example.missyou.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BannerItem {
    @Id
    private long id;
    private String name;
    private String keyword;
    private short type;
    private String image;
}
