package com.epam.auto.ws.urls;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Url {

    BASE_URL("https://jsonplaceholder.typicode.com");

    private final String value;
}
