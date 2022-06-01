package com.nandaparbat.SaasSportClubAPI.services;

import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerSignIn;
import com.nandaparbat.SaasSportClubAPI.entities.Player;
import com.nandaparbat.SaasSportClubAPI.entities.Role;
import com.nandaparbat.SaasSportClubAPI.repositories.PlayerRepository;
import com.nandaparbat.SaasSportClubAPI.security.Jwt;
import com.nandaparbat.SaasSportClubAPI.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {


    private final PlayerRepository playerRepository;

    private final PasswordEncoder encoder;

    private final JwtProvider provider;

    @Transactional
    @Override
    public void create(PlayerCreate inputs){
        Player player = new Player();
        player.setUsername(inputs.getUsername());

        String encoded = encoder.encode(inputs.getPassword());
        player.setPassword(encoded);
        playerRepository.save(player);
    };



    @Override
    public Jwt signIn(PlayerSignIn inputs) {

        String username = inputs.getUsername();
        Player player =
                playerRepository.findByUsernameIgnoreCase(username).orElseThrow(
                    () -> new BadCredentialsException(String.format("password does not match for username '%s' ", username)
                        )
                );

        String password = inputs.getPassword();

        if(!encoder.matches(password, player.getPassword() )){
            throw new BadCredentialsException(String.format("password does " +
                    "not match username '%s' ", username));
        };

        Role role = player.getRole();

        List<String> roles = null;

        if(role != null){
            roles = List.of(role.getRoleName());
        };

        return provider.create(String.valueOf(player.getId()), roles);
    };
};
