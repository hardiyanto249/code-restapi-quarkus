package org.acme.dto.response;

public class ResultDTO {
    public String message;
    public Object data;

    
    public ResultDTO() {
        super();
    }

    public ResultDTO(Object data) {
        super();
        this.data = data;
    }

    public ResultDTO(String message) {
        super();
        this.message = message;
    }

    public ResultDTO(String message, Object data) {
        super();
        this.message = message;
        this.data = data;
    }
    
}
