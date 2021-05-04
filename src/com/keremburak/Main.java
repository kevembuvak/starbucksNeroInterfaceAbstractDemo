package com.keremburak;

import com.keremburak.Abstract.BaseCustomerManager;
import com.keremburak.Concrete.NeroCustomerManager;
import com.keremburak.Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(2002);

        BaseCustomerManager customerManager = new NeroCustomerManager();

        Customer customer = new Customer();
        customer.setDateOfBirth(date);
        customer.setNationalityId("53533111620");
        customer.setFirstName("Kerem Burak");
        customer.setLastName("Yılmaz");

        customerManager.saveToDatabase(customer);
    }
}

