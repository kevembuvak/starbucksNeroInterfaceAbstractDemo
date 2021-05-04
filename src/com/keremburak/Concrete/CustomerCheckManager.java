package com.keremburak.Concrete;

import com.keremburak.Abstract.CustomerCheckService;
import com.keremburak.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
