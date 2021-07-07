package com.lambdaschool.crudorders.services;

import com.lambdaschool.crudorders.models.Customers;
import com.lambdaschool.crudorders.models.Orders;

import java.util.List;

public interface CustomersService {

    List<Customers> findAll();

    List<Orders> findAllOrdersByName();

    Customers save(Customers customer);

    Customers update(Customers customer, long custcode);

    void delete(long custcode);
}
