/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

import java.io.Serializable;
import status.EnumResponseStatus;

/**
 *
 * @author Milan
 */
public class ResponseObject implements Serializable{
    private Object object;
    private String message;
    private EnumResponseStatus status;

    public ResponseObject() {
    }

    public ResponseObject(Object object, String message, EnumResponseStatus status) {
        this.object = object;
        this.message = message;
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EnumResponseStatus getStatus() {
        return status;
    }

    public void setStatus(EnumResponseStatus status) {
        this.status = status;
    }
    
    
}
