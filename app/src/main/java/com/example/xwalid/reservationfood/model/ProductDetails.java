package com.example.xwalid.reservationfood.model;

/**
 * Created by xwalid on 12/03/2017.
 */

public class ProductDetails extends Product {

    private String address,ingredient,nbreOfCommand,extra;


    public ProductDetails() {
        super();
    }

    public ProductDetails(String address, String ingredient, String nbreOfCommand, String extra) {
        this.address = address;
        this.ingredient = ingredient;
        this.nbreOfCommand = nbreOfCommand;
        this.extra = extra;
    }

    public ProductDetails(String productName, String mainIngredient, int rating, String address, String ingredient, String nbreOfCommand, String extra) {
        super(productName, mainIngredient, rating);
        this.address = address;
        this.ingredient = ingredient;
        this.nbreOfCommand = nbreOfCommand;
        this.extra = extra;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getNbreOfCommand() {
        return nbreOfCommand;
    }

    public void setNbreOfCommand(String nbreOfCommand) {
        this.nbreOfCommand = nbreOfCommand;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "address='" + address + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", nbreOfCommand='" + nbreOfCommand + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
