package services;

public class IntegrationTestService {
    private static final String BASE_URL = "https://fakerestapi.azurewebsites.net/api/v1/";

    public static String getBaseUrl() {
        return BASE_URL;
    }
}
