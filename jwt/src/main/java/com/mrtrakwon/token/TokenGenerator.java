package com.mrtrakwon.token;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class TokenGenerator {

    private final SecretKey key;
    public TokenGenerator(String secretKey) {
        this.key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
    }

    public AccessToken generateAccessToken(Map<String, Object> claims){
        String jws =  Jwts.builder()
                .setHeaderParam("alg", "HS256")
                .setClaims(claims)
                .signWith(this.key)
                .compact();

        return new AccessToken(jws);
    }

    public RefreshToken generateRefreshToken(Map<String, Object> claims) {
        String jws =  Jwts.builder()
                .setHeaderParam("alg", "HS256")
                .setClaims(claims)
                .signWith(this.key)
                .compact();

        return new RefreshToken(jws);
    }
}
