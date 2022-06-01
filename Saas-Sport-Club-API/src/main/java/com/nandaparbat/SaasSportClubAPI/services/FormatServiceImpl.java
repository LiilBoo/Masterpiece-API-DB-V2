package com.nandaparbat.SaasSportClubAPI.services;


import com.nandaparbat.SaasSportClubAPI.DTOs.FormatDTO;
import com.nandaparbat.SaasSportClubAPI.entities.Format;
import com.nandaparbat.SaasSportClubAPI.repositories.FormatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormatServiceImpl implements FormatService{

    private final FormatRepository formatRepository;


    @Override
    public List<FormatDTO> findAllByNameEquals(String formatName) {

        return formatRepository.findAllByNameEquals(formatName);
    };

    @Override
    public List<FormatDTO> findFormatById(Long id) {
        return formatRepository.findAllByIdEquals(id);
    };

    @Override
    public List<FormatDTO> findAllProjectedBy() {
       return formatRepository.findAllProjectedBy(FormatDTO.class);
    };
};
