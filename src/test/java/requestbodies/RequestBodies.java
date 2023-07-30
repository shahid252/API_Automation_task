package requestbodies;

import java.util.HashMap;
import java.util.Map;

public class RequestBodies {


        public static Map<String, Object> createPostRequestBody() {
            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("id", 515);
            requestBody.put("title", "string");
            requestBody.put("dueDate", "2023-06-18T16:37:25.172Z");
            requestBody.put("completed", true);
            return requestBody;
        }

        public static Map<String, Object> createUpdateRequestBody() {
            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("id", 514);
            requestBody.put("title", "Updated shahid");
            requestBody.put("dueDate", "2023-06-18T16:37:25.172Z");
            requestBody.put("completed", true);
            return requestBody;
        }


        public static Map<String, Object> createBookRequestBody() {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("id", 1);
        requestBody.put("title", "Updated shahid");
        requestBody.put("description", "test");
        requestBody.put("pageCount", "4544");
        requestBody.put("excerpt", "2023-06-18T16:37:25.172Z");
        requestBody.put("publishDate", "2024-02-21");
        return requestBody;
        }

    public static Map<String, Object> createCoverRequestBody() {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("idBook", 1);
        requestBody.put("url", "https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 1&w=250&h=350");
        return requestBody;

    }


    public static Map<String, Object> expectedResponseBody() {
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("idBook", 1);
        responseBody.put("url", "https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 1&w=250&h=350");
        return responseBody;

    }


}


