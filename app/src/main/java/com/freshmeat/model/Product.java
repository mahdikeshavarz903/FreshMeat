package com.freshmeat.model;

import android.widget.ImageView;

public class Product
{
    private int productId;
    private String description;
    private float price;
    private String name;
    private Rate rate;
    private Property property;
    private ImageView[] imageView;
    private ProductCategory category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public ImageView[] getImageView() {
        return imageView;
    }

    public void setImageView(ImageView[] imageView) {
        this.imageView = imageView;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
