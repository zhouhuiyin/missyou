package com.example.missyou.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="banner")
public class Banner {
    @Id
    private long id;
    @Column(length = 16)
    private String name;
    private String description;
    private String img;
    private String title;

    @OneToMany
    private List<BannerItem> items;
}
