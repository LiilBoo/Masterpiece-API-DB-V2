package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.PairingStyleDTO;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCardView;
import com.nandaparbat.SaasSportClubAPI.repositories.PairingStyleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PairingStyleServiceImpl implements PairingStyleService{

    private final PairingStyleRepository pairingStyleRepository;


    @Override
    public PairingStyleDTO findPairingStyleById() {
        return null;
    };

    @Override
    public PairingStyleDTO findPairingStyleByName() {
        return null;
    };

    @Override
    public List<PairingStyleDTO> findAllProjectedBy() {
        return pairingStyleRepository.findAllProjectedBy(PairingStyleDTO.class);
    };
};
