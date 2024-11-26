package com.youcode.youquiz.Models.Entities;


import com.youcode.youquiz.Models.Embd.QuizAssignmentId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuizAssignment {

    @Id
    private QuizAssignmentId id;

    @Column(nullable = false, name = "reason")
    private String reason;

    @Column(nullable = false, name = "startDate")
    private LocalDate startDate;

    @Column(nullable = false, name = "endDate")
    private LocalDate endDate;

    @Column(nullable = false, name = "attempt")
    private int attempt;

    @Column(nullable = false, name = "score")
    private Double score;

    @Column(nullable = false, name = "result")
    private Double result;


}
