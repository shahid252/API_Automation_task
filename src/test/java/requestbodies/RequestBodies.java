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
    }


