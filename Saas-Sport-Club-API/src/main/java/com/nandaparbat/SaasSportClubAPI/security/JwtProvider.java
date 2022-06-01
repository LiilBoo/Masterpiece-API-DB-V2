package com.nandaparbat.SaasSportClubAPI.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


public class JwtProvider {

    private final String issuer;

    private final Long expiration;

    private final ZoneId zoneId;

    private final Algorithm algorithm;

    public JwtProvider(String issuer, Long expiration, String zoneId,
                       Algorithm algorithm) {
        this.issuer = issuer;
        this.expiration = expiration;
        this.zoneId = ZoneId.of(zoneId);
        this.algorithm = algorithm;
    };

    private Date toJavaUtilDate(LocalDateTime now) {
        return Date.from(now.atZone(zoneId).toInstant());
    };

    public Jwt create(String subject, List<String> roles){
        LocalDateTime now = LocalDateTime.now(zoneId);
        Date issuedAt = toJavaUtilDate(now);
        LocalDateTime expires = now.plusSeconds(expiration);
        Date expiresAt = toJavaUtilDate(expires);
        Builder builder =
                JWT.create().withIssuer(issuer).withIssuedAt(issuedAt).withExpiresAt(expiresAt).withSubject(subject);

        if(roles != null && !roles.isEmpty()){
            builder.withClaim("roles", roles);
        };

        String token = builder.sign(algorithm);

        return new Jwt(token);
    };


}
