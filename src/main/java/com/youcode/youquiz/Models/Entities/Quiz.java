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
@Table(name = "quiz")
public class Quiz {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "duration")
    private int duration;

    @Column(nullable = false, name = "successScore")
    private Double successScore;

    @Column(nullable = false, name = "seeAnswer")
    private Boolean seeAnswer;

    @Column(nullable = false, name = "seeResult")
    private Boolean seeResult;

    @Column(nullable = false, name = "chances")
    private int chances;

    @Column(nullable = false, name = "remark")
    private String remark;
}
