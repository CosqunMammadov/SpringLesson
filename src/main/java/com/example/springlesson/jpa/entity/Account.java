package com.example.springlesson.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "account")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 15)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    boolean isActive;


}
