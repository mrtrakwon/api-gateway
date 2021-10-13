package com.mrtrakwon.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


@Value
@AllArgsConstructor
public class AccessToken implements Token{
    private final String value;
}
