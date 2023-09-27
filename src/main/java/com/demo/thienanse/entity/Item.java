package com.demo.thienanse.entity;

public class Item {
    private Amount price;
    private String gtin;
    private Integer quantity;
    private String name;
    private String category;
    private String sku;
    private String brand;
    private String pageUrl;
    private String imageUrl;

    public Item(Amount price, String gtin, Integer quantity, String name, String category, String sku, String brand, String pageUrl, String imageUrl) {
        this.price = price;
        this.gtin = gtin;
        this.quantity = quantity;
        this.name = name;
        this.category = category;
        this.sku = sku;
        this.brand = brand;
        this.pageUrl = pageUrl;
        this.imageUrl = imageUrl;
    }

    public Amount getPrice() {
        return price;
    }

    public void setPrice(Amount price) {
        this.price = price;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
