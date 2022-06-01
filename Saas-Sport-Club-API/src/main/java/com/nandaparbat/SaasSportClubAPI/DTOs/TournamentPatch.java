package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.entities.Format;
import com.nandaparbat.SaasSportClubAPI.entities.PairingStyle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TournamentPatch {

    private java.lang.Long id;

    private String name;

    private Boolean event;

    private LocalDate dateOfStart;

    private LocalDate dateOfEnd;

    private Integer numberOfRounds;

    private Format format;

    private PairingStyle pairingStyle;

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
