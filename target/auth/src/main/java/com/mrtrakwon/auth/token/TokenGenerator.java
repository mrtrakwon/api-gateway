package com.mrtrakwon.auth.token;

import java.util.Map;

public interface TokenGenerator {
    String generateAccessToken(Map<String, Object> claims);
    String generateRefreshToken()
}
