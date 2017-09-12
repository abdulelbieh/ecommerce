package com.abdul.ecommerce.api.util;

/**
 * Created by abdul on 9/7/17.
 */
public class EcommerceResponse<T> {
    private String message;
    private String responseCode;
    private T entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResponseCode(String responseCode){
        this.responseCode = responseCode;
    }

    public String getResponseCode(){
        return this.responseCode;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
