package com.keremburak.Abstract;

import com.keremburak.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void saveToDatabase(Customer customer) {
        System.out.println("Saved to db: " + customer.getFirstName());
    }
}
