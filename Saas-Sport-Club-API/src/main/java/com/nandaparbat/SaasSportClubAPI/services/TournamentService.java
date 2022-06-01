package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCardView;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentPatch;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentView;

import java.util.List;


public interface TournamentService {

    //* -------- POST requests
    void tournamentCreate(TournamentCreate inputs);

    //* ------ Get requests ------ //

    //* WORKS
    TournamentView findWithId(Long id);

    //* WORKS => DTO => Front-end Home Page
    List<TournamentCardView> findAllToursCards();

    //* WORKS => DTO
    List<TournamentCardView> findAllByEventIsTrue();

    //* WORKS => DTO
    List<TournamentView> findAllByContactContains(String contact);

    //* WORKS => DTO
    List<TournamentView> findAllByNameIsContaining(String name);

    //* WORKS => DTO
    List<TournamentView> findAllByFormatContains(String formatName);

    //* WORKS => DTO
    // TODO : Refactor format and Pairing to String ?
    List<TournamentCardView> paginatePer10(Long x);

    //*--------- DELETE requests -------------

    //* WORKS => Returns ... nothing ?
    void deleteWithId(Long id);

    //* -- PATCH Requests ✅
    void update1Tournament(TournamentPatch inputs, Long id);

    // ! --------- CHECK LINE ---------- //


    void overrideTournament(TournamentPatch inputs, Long id);




    //* -- PUT Requests
}
