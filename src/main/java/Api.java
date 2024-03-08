import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Api {
    public static final String URL = "http://qa-scooter.praktikum-services.ru";
    public static final String COURIER_LOGIN = "/api/v1/courier/login";
    public static final String COURIER_ORDER = "/api/v1/orders";
    public static final String CREATE_COURIER = "/api/v1/courier";
    public static final String DELETE_COURIER = "/api/v1/courier/";
    public static final String CANCEL_ORDER = "/api/v1/orders/cancel";
    public static final String GET_ORDER = "/api/v1/orders/track?t=";
    public static final String GET_ORDER_LIST = "/api/v1/orders";

    private RequestSpecification baseRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new ErrorLoggingFilter())
                .build();
    }
}
