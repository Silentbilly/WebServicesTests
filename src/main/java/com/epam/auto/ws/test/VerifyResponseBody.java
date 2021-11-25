package com.epam.auto.ws.test;

import com.epam.auto.ws.objects.User;
import com.epam.auto.ws.utils.HttpRequestUtils;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyResponseBody {

  @Test(description = "Response body verifying")
  public void verifyResponseBody() {

    Response response = HttpRequestUtils.getAllUsers();

    ResponseBody responseBody = response.getBody();
    User[] users = responseBody.as(User[].class);

    Assert.assertEquals(users.length, 10);
  }
}
