package com.niit.domain;

public class Product {
    private int productId;
    private int price;
    private String email;

    public Product() {
    }

    public Product(int productId, int price, String email) {
        this.productId = productId;
        this.price = price;
        this.email = email;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", price=" + price +
                ", email='" + email + '\'' +
                '}';
    }
}
