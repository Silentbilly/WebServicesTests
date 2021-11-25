package com.epam.auto.ws.utils;

import static io.restassured.RestAssured.given;

import com.epam.auto.ws.endpoints.Endpoints;
import com.epam.auto.ws.urls.Url;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HttpRequestUtils {

  public static Response getAllUsers() {
    return given().relaxedHTTPSValidation()
        .log().all()
        .baseUri(Url.BASE_URL.getValue())
        .when()
        .get(Endpoints.USERS.getValue())
        .then()
        .log().all()
        .extract()
        .response();
  }
}
