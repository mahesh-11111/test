package Rest_api;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Requset_specification 
{
public static void main(String[] args)	

{
	RequestSpecBuilder reqspecbuild = new RequestSpecBuilder();
	 RequestSpecification Rs= reqspecbuild.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
	 
	 Response res= given().spec(Rs).when().get("/api/users?page=2").then().statusCode(200).and().contentType(ContentType.JSON).extract().response();
	 
	 System.out.println(res.asString());
			
}
}
