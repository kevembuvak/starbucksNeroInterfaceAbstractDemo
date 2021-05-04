package com.keremburak.Concrete;

import com.keremburak.Abstract.BaseCustomerManager;
import com.keremburak.Abstract.CustomerCheckService;
import com.keremburak.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService checkService;

    public StarbucksCustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void saveToDatabase(Customer customer) {
        if(checkService.checkIfRealPerson(customer)){
            super.saveToDatabase(customer);
        } else {
            System.out.println("NOT REAL PERSON");
        }

    }
}
