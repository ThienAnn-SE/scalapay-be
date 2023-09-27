package com.demo.thienanse.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class OrderResponse {
    @JsonProperty("token")
    private String token;
    @JsonProperty("expires")
    private Instant expires;
    @JsonProperty("checkoutUrl")
    private String checkoutUrl;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Instant getExpires() {
        return expires;
    }

    public void setExpires(Instant expires) {
        this.expires = expires;
    }

    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    public void setCheckoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
    }
}
