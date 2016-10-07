
package be.jeroendruwe.k8s.productowner.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jdruwe on 07/10/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeveloperResponse {

    private String Message;

    public DeveloperResponse() {
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }
}
