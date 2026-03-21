package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecBuilderUtil {
    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.get("baseUrl"))
                .addHeader("Content-Type", "application/json")
                .addHeader("x-api-key", ConfigManager.get("apiKey"))
                .build();
    }
}

