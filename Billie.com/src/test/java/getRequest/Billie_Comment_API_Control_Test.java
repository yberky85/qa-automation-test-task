package getRequest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import org.testng.annotations.Test;

import billie.utilities.Billie_API_Initialize;

public class Billie_Comment_API_Control_Test extends Billie_API_Initialize{

	

	@Test
	public void getResponse_sizeControl() {
		//Response response = 
			given()
				.log()
				.ifValidationFails()
				.spec(requestSpec)
			.when()
				//Make GET request to https://jsonplaceholder.typicode.com/comments
				.get()
			.then()
				.statusCode(200)
				.rootPath("")
				//Make sure that post with id 40 contains 5 comments
				.body("size()", equalTo(5))
				//Make sure that post with id 40 contains the following comment:
				.body("id", hasItem(199))
				.body("name", hasItem("pariatur aspernatur nam atque quis"))
				.body("email", hasItem("Cooper_Boehm@damian.biz"))
				.body("body", hasItem("veniam eos ab voluptatem in fugiat ipsam quis\nofficiis non qui\nquia ut id voluptates et a molestiae commodi quam\ndolorem enim soluta impedit autem nulla"));
				//.extract()
				//.response();

		//System.out.println(response.asString());
	}	
			@Test
			public void getResponse_specificCommentControl() {
				
				requestBuilder.addQueryParam("id", "199");
				requestSpec = requestBuilder.build();
				//Response response = 
					given()
						.log()
						.ifValidationFails()
						.spec(requestSpec)
					.when()
						//Make GET request to https://jsonplaceholder.typicode.com/comments
						.get()
					.then()
						.statusCode(200)
						.rootPath("")
						//Make sure that post with id 40 contains the following comment:
						.body("id", hasItem(199))
						.body("name", hasItem("pariatur aspernatur nam atque quis"))
						.body("email", hasItem("Cooper_Boehm@damian.biz"))
						.body("body", hasItem("veniam eos ab voluptatem in fugiat ipsam quis\nofficiis non qui\nquia ut id voluptates et a molestiae commodi quam\ndolorem enim soluta impedit autem nulla"));
						//.extract()
						//.response();

	}
	
	
}
