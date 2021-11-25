package com.epam.auto.ws.endpoints;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Endpoints {

  USERS("/users");

  private final String value;
}
