package com.nandaparbat.SaasSportClubAPI.entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="pairing_styles")
public class PairingStyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pairing_style")
    private String name;

    public Long getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public void setName(String pairingStyle) {
        this.name = pairingStyle;
    };
};
