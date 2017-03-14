package com.example.xwalid.reservationfood.model;

/**
 * Created by xwalid on 11/03/2017.
 */

public class Product {

    private String productName,mainIngredient,imageUrl;
    private int rating,price;


    public Product() {
        super();
    }

    public Product(String productName, String mainIngredient, int rating) {
        this.productName = productName;
        this.mainIngredient = mainIngredient;
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                "imageUrl='" + imageUrl + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
