package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 
import org.json.simple.JSONObject;

public class API_Test {
//	@Test
//	public void getRequest() {
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
//				.body("data[2].first_name", equalTo("Tobias"))
//				.body("data.first_name", hasItems("Michael", "Lindsay", "Tobias", "Byron"));
////Line 20 to get more than one items
//	}
//
//	@Test
//	public void postRequest() {
//		JSONObject payload = new JSONObject();
//		payload.put("name", "Harry");
//		payload.put("job", "QA");
//		System.out.println(payload.toJSONString());
//
//		given().body(payload.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log()
//				.all();
//	}
//
//	@Test
//	public void putRequest() {
//		JSONObject payload = new JSONObject();
//		payload.put("name", "Harry");
//		payload.put("job", "QA");
//		System.out.println(payload.toJSONString());
//
//		given().body(payload.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log()
//				.all();
//
//	}
//
//	@Test
//	public void deleteRequest() {
//		given().delete("https://reqres.in/api/users/2").then().statusCode(204);
//	}
	public static String token = "b76219852f4fa4d2482893d49977142b97c514491b66bfc3fc032c5b3b623106";
	@Test
	public void goRestCreateUser() { 
			   
			  JSONObject payload = new JSONObject(); 
			  payload.put("name", "Dona Gurung"); 
			  payload.put("gender", "female"); 
			  payload.put("email", "donnagurung55@gmail.com"); 
			  payload.put("status", "active"); 
			   
			  given() 
			  .header("Authorization","Bearer "+ token) 
			  .accept(ContentType.JSON) 
			  .contentType("application/json") 
			  .body(payload.toString()) 
			  .post("https://gorest.co.in/public/v2/users")
			  .then() 
			  .statusCode(201).log().all(); 	
	}
	@Test
	public void ListUsers() { 
		  given()
		  .header("Authorization", "Bearer"+ token) 
		  .accept(ContentType.JSON).contentType("application/json")
		  .get("https://gorest.co.in/public/v2/users") 
		  .then()
		  .statusCode(200).log().all(); 		 
		 }
	
	@Test(enabled = true) 
	 public void updateUser() { 
	 
	  JSONObject payload = new JSONObject(); 
	  payload.put("name", "Dona Gurung"); 
	  payload.put("email", "donnag@gmail.com"); 
	  payload.put("status", "active"); 
	 
	  given().header("Authorization", "Bearer"+ token) 
	    .accept(ContentType.JSON).contentType("application/json")
	    .body(payload.toString()) 
	    .patch("https://gorest.co.in/public/v2/users/32093")
	    .then()
	    .statusCode(200).log().all(); 
	 
	 } 
	@Test
	 public void deleteUser() { 
		
		  given()
		  .header("Authorization", "Bearer b76219852f4fa4d2482893d49977142b97c514491b66bfc3fc032c5b3b623106") 
		  .accept(ContentType.JSON).contentType("application/json") 
		  .delete("https://gorest.co.in/public/v2/users/4440")
		  .then()
		  .statusCode(204).log().all(); 
		 
		 }
	
		 
}
