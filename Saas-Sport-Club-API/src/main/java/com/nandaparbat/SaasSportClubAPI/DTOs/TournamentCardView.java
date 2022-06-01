package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.entities.Format;
import com.nandaparbat.SaasSportClubAPI.entities.PairingStyle;

public interface TournamentCardView {

    public java.lang.Long getId();

    public String getName();

    public PairingStyle getPairingStyle();

    public Format getFormat();

    public Integer getFirstPrice();

    public Integer getRegisterFeeSenior();

    public Integer getRegisterFeeJunior();

//    public String getDescription();

};
