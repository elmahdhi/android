package com.example.xwalid.reservationfood.test;

import com.example.xwalid.reservationfood.model.Product;
import com.example.xwalid.reservationfood.model.ProductDetails;
import com.example.xwalid.reservationfood.model.Request;
import com.example.xwalid.reservationfood.model.UserProfile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xwalid on 12/03/2017.
 */

public class Test {

    static List<Product> productListt = new ArrayList<>();
    static List<ProductDetails> productDetailsList = new ArrayList<>();


    public static void addProduct(){
        Product product1 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        Product product = new Product();
        product.setProductName("سندويتشات");
        product.setMainIngredient("دجاج مع توابل");
        product.setRating(10);
        product.setPrice(20);
        product.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        Product product2 = new Product();
        product2.setProductName("سندويتشات");
        product2.setMainIngredient("دجاج مع توابل");
        product2.setRating(10);
        product2.setPrice(20);
        product2.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/BLT_sandwich_on_toast.jpg/220px-BLT_sandwich_on_toast.jpg");

        Product product3 = new Product();
        product3.setProductName("سندويتشات");
        product3.setMainIngredient("دجاج مع توابل");
        product3.setRating(10);
        product3.setPrice(20);
        product3.setImageUrl("http://www.earlofsandwichusa.com/wp-content/uploads/2016/05/Sandwich_Veggie-min.jpg");

        productListt.add(product);
        productListt.add(product1);
        productListt.add(product2);
        productListt.add(product3);
    }

    public static List<Product> getProductListt() {
        if(productListt.isEmpty()){
            addProduct();
        }
        return productListt;
    }


    public static void addProductDetails(){
        ProductDetails productDetails = new ProductDetails();
        productDetails.setAddress("Rue de canal 75001");
        productDetails.setProductName("دجاج مصلي");
        productDetails.setImageUrl("http://www.earlofsandwichusa.com/wp-content/uploads/2016/05/Sandwich_Veggie-min.jpg");
        productDetails.setMainIngredient("دجاج مع توابل");
        productDetails.setRating(17);
        productDetails.setPrice(30);
        productDetails.setNbreOfCommand("3 أشخاص");
        productDetails.setExtra("إضافة");

        productDetailsList.add(productDetails);
    }

    public static List<ProductDetails> getProductDetailsList() {
        if(productDetailsList.isEmpty()){
            addProductDetails();
        }
        return productDetailsList;
    }

    public static UserProfile addUser(){
        UserProfile user = new UserProfile();
        user.setFirstName("أم");
        user.setLastName("أحمد");
        user.setEmail("ommahmad@gmail.com");
        user.setNbrDemands(20);
        user.setPassword("123456");
        user.setNbrJours(7);
        user.setNbrRecp(30);
        user.setImageUrl("");

        return user;
    }

    public static Request addRequest(){
        Request request = new Request();
        request.setWorklfowId(10);
        request.setChefName("أحمد");

        Product product1 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("http://www.earlofsandwichusa.com/wp-content/uploads/2016/05/Sandwich_Veggie-min.jpg");
        request.setProduct(product1);
        request.setTimeOut(10);
        request.setCustomerName("ali");
        return request;
    }



}
