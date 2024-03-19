package com.example.userManagementSystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_info")
@Entity
public class User {
    @Id
    private int userId;
    private String name;
    private int age;
    private String mobile;
}
