package com.spring.boot.jpa.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "rollNumber")
    private int rollNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

}
