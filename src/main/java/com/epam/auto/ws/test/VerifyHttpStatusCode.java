package com.epam.auto.ws.test;

import com.epam.auto.ws.endpoints.Endpoints;
import com.epam.auto.ws.utils.HttpRequestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHttpStatusCode {

  @Test(description = "Status code verifying")
  public void verifyStatusCode() {

    Response response = HttpRequestUtils.getAllUsers();
    Assert.assertEquals(response.getStatusCode(), 200);
  }
}
