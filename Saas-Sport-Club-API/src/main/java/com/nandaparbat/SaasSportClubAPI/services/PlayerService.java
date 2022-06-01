package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerSignIn;
import com.nandaparbat.SaasSportClubAPI.security.Jwt;

public interface PlayerService {

    void create(PlayerCreate inputs);

    Jwt signIn(PlayerSignIn inputs);



}
