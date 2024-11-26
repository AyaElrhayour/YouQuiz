package com.youcode.youquiz.Models.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @UuidGenerator
    protected UUID id;

    @Column(nullable = false , name = "name")
    protected String name;

    @Column(nullable = false, name = "lastName")
    protected String lastName;

    @Column(nullable = false, name = "adress")
    protected String adress;

    @Column(nullable = false, name = "birthDate")
    protected String birthDate;
}
