package be.jeroendruwe.k8s.developer.model;

/**
 * Created by jdruwe on 07/10/16.
 */
public class DeveloperResponse {

    private String Message;

    public DeveloperResponse(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }
}
