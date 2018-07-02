package billie.utilities;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.lessThan;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Billie_API_Initialize {
	protected RequestSpecBuilder requestBuilder;
	public static RequestSpecification requestSpec;
	ResponseSpecBuilder responseBuilder;
	static ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setup() {
		requestBuilder = new RequestSpecBuilder();
		requestBuilder.setBaseUri(Billie_Constants.BASE_URI);
		requestBuilder.setBasePath(Billie_Constants.BASE_PATH);
		requestBuilder.addQueryParam("postId", "40");
		requestSpec = requestBuilder.build();

		responseBuilder = new ResponseSpecBuilder();
		responseBuilder.expectStatusCode(200);
		responseBuilder.expectResponseTime(lessThan(2L), TimeUnit.SECONDS);
		responseBuilder.expectBody("postId", hasItem(40));
		responseSpec = responseBuilder.build();
	}
}
