package com.freshmeat.model;

import android.widget.ImageView;

import java.util.ArrayList;

public class Butcher extends User
{
    private ArrayList<Post> post;
    private ArrayList<Product> product;
    private ButcherPermissions butcherPermissions;
    private LicenceActivity licenceActivity;
    private SlaughterHouse slaughterHouse;
    private Rate rate;
    private ImageView butcherLogo;
    private ArrayList<Orders> orders;

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders.add(orders);
    }

    public ImageView getButcherLogo() {
        return butcherLogo;
    }

    public void setButcherLogo(ImageView butcherLogo) {
        this.butcherLogo = butcherLogo;
    }

    public void setPost(Post p) {
        this.post.add(p);
    }

    public ArrayList<Post> getPost() {
        return post;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product.add(product);
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public ButcherPermissions getButcherPermissions() {
        return butcherPermissions;
    }

    public void setButcherPermissions(ButcherPermissions butcherPermissions) {
        this.butcherPermissions = butcherPermissions;
    }

    public LicenceActivity getLicenceActivity() {
        return licenceActivity;
    }

    public void setLicenceActivity(LicenceActivity licenceActivity) {
        this.licenceActivity = licenceActivity;
    }

    public SlaughterHouse getSlaughterHouse() {
        return slaughterHouse;
    }

    public void setSlaughterHouse(SlaughterHouse slaughterHouse) {
        this.slaughterHouse = slaughterHouse;
    }

    public boolean statusOrder()
    {
        //TODO : status order
        return true;
    }

    public void createProduct()
    {
        //TODO : add new product for butcher
    }

    public void removeProduct()
    {
        //TODO : remove butcher product from database
    }

    public void editProduct()
    {
        //TODO : edit butcher product
    }


}
