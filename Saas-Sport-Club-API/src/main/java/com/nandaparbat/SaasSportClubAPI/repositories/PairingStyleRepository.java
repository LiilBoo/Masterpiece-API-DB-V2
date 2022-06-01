package com.nandaparbat.SaasSportClubAPI.repositories;

import com.nandaparbat.SaasSportClubAPI.entities.PairingStyle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PairingStyleRepository extends JpaRepository<PairingStyle, Long> {


    //* WORKS => DTO
    <Type> List<Type> findAllProjectedBy(Class<Type> type);

};
