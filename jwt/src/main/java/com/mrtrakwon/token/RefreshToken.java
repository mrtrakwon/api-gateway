package com.mrtrakwon.token;

import lombok.AllArgsConstructor;
import lombok.Value;


@Value
@AllArgsConstructor
public class RefreshToken implements Token{
    private final String value;
}
