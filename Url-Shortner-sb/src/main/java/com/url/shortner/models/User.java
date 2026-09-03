package com.url.shortner.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private  String username;

    @Column(nullable = false)
    private  String password;

    @Column(unique = true, nullable = false)
    private  String email;

    @Column(nullable = false)
    private  String role = "ROLE_USER";
}
