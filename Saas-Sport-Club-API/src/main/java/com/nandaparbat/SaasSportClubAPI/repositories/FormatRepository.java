package com.nandaparbat.SaasSportClubAPI.repositories;

import com.nandaparbat.SaasSportClubAPI.DTOs.FormatDTO;
import com.nandaparbat.SaasSportClubAPI.entities.Format;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormatRepository extends JpaRepository<Format, java.lang.Long> {


    //* WORKS => DTO
    <Type> List<Type> findAllProjectedBy(Class<Type> type);


    List<FormatDTO> findAllByNameEquals(String formatName);

    List<FormatDTO> findAllByIdEquals(java.lang.Long id);

//    boolean existsByName(String existingName);
//
//    boolean existsById(java.lang.Long id);

};
