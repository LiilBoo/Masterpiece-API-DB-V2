package com.nandaparbat.SaasSportClubAPI.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "formats")
public class Format {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "format_name")
    private String name;


    public Long getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public void setName(String formatName) {
        this.name = formatName;
    };
};
