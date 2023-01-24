package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestAPI {
	@Test
	public void Test_01() {
		
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 200);
	}
}
