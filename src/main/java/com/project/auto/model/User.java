package com.project.auto.model;

import javax.persistence.*;

@Entity
@Table(name="user_table")
public class User {

    @Id @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;


    @Column(name = "lastname")
    private String lastname;


    @Column(name = "age")
    private String age;


    @Column(name = "password")
    private String password;

}
