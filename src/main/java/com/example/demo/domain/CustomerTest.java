package com.example.demo.domain;

import org.testng.annotations.Test;

import io.ebean.DB;
import io.ebean.Database;

public class CustomerTest {

    @Test
    public void insertFindDelete() {

        Customer customer = new Customer();
        customer.setName("Hello world");


        Database database = DB.getDefault();

        // insert the customer in the DB
        database.save(customer);


        // Find by Id
        Customer foundHello = database.find(Customer.class, 1);

        System.out.print("hello " + foundHello.getName());

        // delete the customer
        database.delete(customer);
    }

}