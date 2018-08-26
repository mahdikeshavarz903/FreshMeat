package com.freshmeat.model;

import java.util.ArrayList;

public class Customer extends User {
    private Orders orders;
    private CustomerFavorite favorite;
    private Score score;
    private ArrayList<Transaction> transaction;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public CustomerFavorite getFavorite() {
        return favorite;
    }

    public void setFavorite(CustomerFavorite favorite) {
        this.favorite = favorite;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }

    public void createOrder() {
        orders = new Orders();
    }

    public void addNewProductToOrder() {
        //TODO : add new product to order
    }

    public void removeProductFromOrder() {
        //TODO : remove product from order
    }

    public void submitOrder(Orders order) {
        //TODO : submit order
    }
}
