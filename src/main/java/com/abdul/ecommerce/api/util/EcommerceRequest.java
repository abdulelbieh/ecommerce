package com.abdul.ecommerce.api.util;

/**
 * Created by abdul on 7/29/17.
 */
public class EcommerceRequest<T> {
    private String message;
    private String responseCode;
    private T entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
