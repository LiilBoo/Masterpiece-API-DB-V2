package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.FormatDTO;
import com.nandaparbat.SaasSportClubAPI.entities.Format;

import java.util.List;

public interface FormatService {

    List<FormatDTO> findAllByNameEquals(String formatName);

    List<FormatDTO> findFormatById(Long id);

    List<FormatDTO> findAllProjectedBy();


};
