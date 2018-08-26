package com.freshmeat.model;

import android.widget.ImageView;

public class User
{
    private int nationalCode;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private String birthdayDate;
    private ImageView[] userPhoto;


    public User() {
    }

    public User(int nationalCode, String firstName, String lastName, String phoneNumber, String emailAddress, Address address, String birthdayDate) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.birthdayDate = birthdayDate;
    }

    public ImageView[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(ImageView[] userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

}
