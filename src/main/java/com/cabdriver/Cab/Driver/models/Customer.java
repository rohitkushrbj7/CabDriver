package com.cabdriver.Cab.Driver.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    // @Entity model convert customer model  table to our database
    @Id  //to id primary key
    private Integer id;
    private Integer age;
    private String password;
    private String firstname;
    private String lastname;
    @Column(unique=true, nullable=false)
    private String email;
    @Column(unique=true,nullable=false)
    private String phoneNumber;
    private String address;

}
