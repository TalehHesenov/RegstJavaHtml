package com.example.qeydiyyat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id

    private long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;
}
