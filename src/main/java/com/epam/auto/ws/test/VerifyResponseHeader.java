package com.epam.auto.ws.test;

import com.epam.auto.ws.utils.HttpRequestUtils;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class VerifyResponseHeader {

  @Test(description = "Response Header verifying")
  public void verifyResponseHeader() {

    Response response = HttpRequestUtils.getAllUsers();

    String responseContentTypeHeader = response.getHeader("Content-Type");

    Assertions.assertThat(responseContentTypeHeader)
        .isNotEmpty()
        .isEqualTo("application/json; charset=utf-8");
  }
}
