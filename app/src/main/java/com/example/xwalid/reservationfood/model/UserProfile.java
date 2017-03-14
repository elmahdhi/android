package com.example.xwalid.reservationfood.model;

import java.util.Date;
import java.util.List;

/**
 * Created by xwalid on 11/03/2017.
 */

public class UserProfile {

    private String firstName,lastName,password,email,imageUrl;
    private int nbrDemands,nbrRecp,nbrJours;
    private List<Request> requests;


    public UserProfile() {
        super();
    }

    public UserProfile(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNbrDemands() {
        return nbrDemands;
    }

    public void setNbrDemands(int nbrDemands) {
        this.nbrDemands = nbrDemands;
    }

    public int getNbrRecp() {
        return nbrRecp;
    }

    public void setNbrRecp(int nbrRecp) {
        this.nbrRecp = nbrRecp;
    }

    public int getNbrJours() {
        return nbrJours;
    }

    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", nbrDemands=" + nbrDemands +
                ", nbrRecp=" + nbrRecp +
                ", nbrJours=" + nbrJours +
                '}';
    }
}
