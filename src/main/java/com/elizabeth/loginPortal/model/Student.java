package com.elizabeth.loginPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok creates the constructor, getters and setters
@AllArgsConstructor //lombok creates the constructor, getters and setters
@NoArgsConstructor //lombok creates the constructor, getters and setters
@Entity //Creates the table
@Table(name="student") // table name
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // To autoincrement
    private Long id;
    @Column
    private String fullName;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @Column
    private String address;




}