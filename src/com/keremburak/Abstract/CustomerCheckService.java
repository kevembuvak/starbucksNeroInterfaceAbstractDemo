package com.keremburak.Abstract;

import com.keremburak.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
