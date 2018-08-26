package com.freshmeat.model;

public class Customer extends User
{
    private Orders orders;
    private CustomerFavorite favorite;
    private Score score;
    private TransactionHistory transactionHistory;

    public void submitOrder()
    {
        Delivery delivery=new Delivery();
        Schedule schedule=new Schedule();

        //TODO : customer submit order

        orders.setDelivery(delivery);
        orders.setSchedule(schedule);
    }

    public void createOrder()
    {
        orders=new Orders();
    }

    public void addNewProductToOrder()
    {
        //TODO : add new product to order
    }

    public void removeProductFromOrder()
    {
        //TODO : remove product from order
    }
}
