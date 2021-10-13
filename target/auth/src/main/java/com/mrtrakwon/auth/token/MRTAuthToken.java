package com.mrtrakwon.auth.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


@Getter
@Value
@AllArgsConstructor
public class MRTAuthToken {
    private final String accessToken;
    private final String refreshToken;
}
