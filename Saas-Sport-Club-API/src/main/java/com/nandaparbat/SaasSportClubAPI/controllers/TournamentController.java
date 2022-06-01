package com.nandaparbat.SaasSportClubAPI.controllers;


import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCardView;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentPatch;
import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentView;
import com.nandaparbat.SaasSportClubAPI.services.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tournaments")
@RequiredArgsConstructor
public class TournamentController {

    private final TournamentService tournamentService;

    //* ------ GET REQUESTS -----------

    //* WORKS => DTO
    @GetMapping("/tour-cards")
    @ResponseStatus(HttpStatus.OK)
    public List<TournamentCardView> findAllTourCards(){
        return tournamentService.findAllToursCards();
    };

    //* WORKS => DTO
    @GetMapping("/with-id")
    @ResponseStatus(HttpStatus.OK)
    public TournamentView findWithID(@RequestParam("id") Long id){
        return  tournamentService.findWithId(id);
    };


    //* WORKS => DTO
    @GetMapping("/events")
    @ResponseStatus(HttpStatus.OK)
    public List<TournamentCardView> findAllByEventIsTrue(){
        return tournamentService.findAllByEventIsTrue();
    };

    //* WORKS => DTO
    // TODO : IgnoreCase => case insensitivity
    @GetMapping("/by-name")
    @ResponseStatus(HttpStatus.OK)
    public List<TournamentView> findAllByNameIsContaining(@RequestParam("tourname") String tourName){
        return tournamentService.findAllByNameIsContaining(tourName);
    };

    //* WORKS => DTO
    @GetMapping("/by-contact")
    @ResponseStatus(HttpStatus.OK)
    public List<TournamentView> findAllByContactContains(@RequestParam("contact") String contact){
        return tournamentService.findAllByContactContains(contact);
    };

    //* WORKS => DTO
    @GetMapping("/by-format")
    @ResponseStatus(HttpStatus.OK)
    public List<TournamentView> findAllByFormatContains(@RequestParam("format") String formatName){
        return tournamentService.findAllByFormatContains(formatName);
    };

    //* In front : this.http.get<any>(${this.apiUrl}/tournaments/per-page?from=${x}&?to=${x + 10}
    //* x being the last id in the array of the previous page => dynamically stored in 'tampon' variable, then
    //* re-computed on every http.requests


@GetMapping("/per-page")
@ResponseStatus(HttpStatus.OK)
public List<TournamentCardView> paginatePer10(@RequestParam("page") Long x) {
    return tournamentService.paginatePer10(x);
};
    // TODO : Per month ? => Time ? implement : Don't implent


    //* ---------- DELETE REQUESTS ----------------------------------

    //* WORKS
    @DeleteMapping("delete-id")
    @ResponseStatus(HttpStatus.OK)
    public void deleteWithId(@RequestParam("id") Long id) {
        tournamentService.deleteWithId(id);
    };

    //* ---------- PATCH REQUESTS ------------------------------

    @PatchMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void update1Tournament(@RequestBody TournamentPatch inputs, @RequestParam("id") Long id){
        tournamentService.update1Tournament(inputs, id);
    };

    //! ---- CHECK LINE : CODE ABOVE WORKS ------------------------------------------------------ //

    @PutMapping("/put")
    @ResponseStatus(HttpStatus.OK)
    public void overrideTournament(@RequestBody TournamentPatch inputs,
                                             @RequestParam("id") Long id){
        tournamentService.overrideTournament(inputs, id);
    };

    //* -------- PUT REQUESTS

    //* ---------- POST REQUEST

    //!FAILS
    @PostMapping("/create-tour")
    @ResponseStatus(HttpStatus.CREATED)
    public void tournamentCreate(@RequestBody TournamentCreate inputs){
        tournamentService.tournamentCreate(inputs);
    };






};
