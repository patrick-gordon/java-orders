package com.lambdaschool.crudorders.repos;

import com.lambdaschool.crudorders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepo extends CrudRepository <Customers, Long> {
}
