package com.nandaparbat.SaasSportClubAPI.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TournamentView {


    //! CONSTRUCTOR FOR EVENTS
    //! DO NOT DELETE
    public TournamentView(Long id,
                          String name,
                          String format,
                          String pairingStyle,
                          Integer firstPrice,
                          Integer registerFeeSenior,
                          Integer registerFeeJunior)
    {
        this.id = id;
        this.name = name;
        this.format = format;
        this.pairingStyle = pairingStyle;
        this.firstPrice = firstPrice;
        this.registerFeeSenior = registerFeeSenior;
        this.registerFeeJunior = registerFeeJunior;
    };
    //! CONSTRUCTOR FOR EVENTS
    //! DO NOT DELETE

    private Long id;

    private String name;

    private boolean event;

    private LocalDate dateOfStart;

    private LocalDate dateOfEnd;

    private int numberOfRounds;

    private String format;

    private String pairingStyle;

    private String organisator;

    private String contact; //personalUrl or email

    private Integer capacity;

    private Integer firstPrice;

    private Integer secondPrice;

    private Integer thirdPrice;

    private Integer registerFeeSenior;

    private Integer registerFeeJunior;

    private String description;


};
