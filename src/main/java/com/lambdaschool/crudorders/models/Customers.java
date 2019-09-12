package com.lambdaschool.crudorders.models;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custcode;

    @Column(nullable = false)
    private String custname;

    private String custcity;

    private String workingarea;

    private String custcountry;

    private String grade;

    private double openingamt;

    private double receiveamt;

    private double paymentamt;

    private double outstandingamt;

    private String phone;

    @Column(nullable = false)
    @OneToMany(mappedBy = "customers")
    private long agentcode;


}
