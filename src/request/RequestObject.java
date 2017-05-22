/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import java.io.Serializable;

/**
 *
 * @author Milan
 */
public class RequestObject implements Serializable{
    private Object object;
    private int action;

    public RequestObject() {
    }

    public RequestObject(Object object, int action) {
        this.object = object;
        this.action = action;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
    
    
}
