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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "level")
public class Level {

    @Id
    @UuidGenerator
    private UUID id;

    @Column
    private String description;

    @Column
    private Double maxScore;

    @Column
    private Double minScore;
}
