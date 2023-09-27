package com.demo.thienanse.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Order {
    @JsonProperty("totalAmount")
    private Amount totalAmount;

    @JsonProperty("consumer")
    private Consumer consumer;

    @JsonProperty("shipping")
    private Shipping shipping;

    @JsonProperty("merchant")
    private Merchant merchant;

    @JsonProperty("shippingAmount")
    private Amount shippingAmount;

    @JsonProperty("taxAmount")
    private Amount taxAmount;

    @JsonProperty("type")
    private String type;

    @JsonProperty("product")
    private String product;

    @JsonProperty("frequency")
    private Frequency frequency;

    @JsonProperty("orderExpiryMilliseconds")
    private Integer orderExpiryMilliseconds;

    @JsonProperty("merchantReference")
    private String merchantReference;

    @JsonProperty("items")
    private List<Item> items = new ArrayList<>();

    public Amount getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Amount totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Amount getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(Amount shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public Amount getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Amount taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Integer getOrderExpiryMilliseconds() {
        return orderExpiryMilliseconds;
    }

    public void setOrderExpiryMilliseconds(Integer orderExpiryMilliseconds) {
        this.orderExpiryMilliseconds = orderExpiryMilliseconds;
    }

    public String getMerchantReference() {
        return merchantReference;
    }

    public void setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
