package com.spe.spring_boot_demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// entity class for user table with id and name attributes
@Entity @Table(name = "User")
@Getter @Setter
public class User {

    @GeneratedValue
    private final Long id;

    @Column(name = "firstName")
    private String firstName;

    // user constructor
    public User(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    // empty user constructor
    public User() {id = 0L;}

}
