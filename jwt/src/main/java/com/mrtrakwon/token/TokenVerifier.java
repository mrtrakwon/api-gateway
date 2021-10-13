package com.mrtrakwon.token;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class TokenVerifier<T> {
    private final String secretKey;
    private final SecretKey key;
    public TokenVerifier(String secretKey) {
        this.secretKey = secretKey;
        this.key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
    }

    public T verify(Token token) {
        Jws<Jwts.parserBuilder()
                .setSigningKey(this.key)
                .build()
                .parseClaimsJws(token.getValue());
    }

}
