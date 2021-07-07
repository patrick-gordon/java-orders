package com.lambdaschool.crudorders.repos;

import com.lambdaschool.crudorders.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository <Orders, Long> {
}
