package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.PairingStyleDTO;

import java.util.List;

public interface PairingStyleService {


    PairingStyleDTO findPairingStyleById();

    PairingStyleDTO findPairingStyleByName();

    List<PairingStyleDTO> findAllProjectedBy();

};
