package com.youcode.youquiz.Models.Entities;


import com.youcode.youquiz.Models.Embd.AnswerValidationId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnswerValidation {

    @Id
    private AnswerValidationId id;

    @Column(nullable = false, name = "points")
    private int points;
}
