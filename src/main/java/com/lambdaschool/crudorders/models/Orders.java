package com.lambdaschool.crudorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    private double ordamount;

    private double advanceamount;

    @ManyToOne
    private long custcode;

    private String orddescription;

}
