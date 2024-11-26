package com.youcode.youquiz.Models.Entities;

import com.youcode.youquiz.Models.Enums.QuestionType;
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
@Table(name = "question")
public class Question {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, name = "question")
    private String question;

    @Column(nullable = false, name = "answer")
    private int answer;

    @Column(nullable = false, name = "correctAnswer")
    private int correctAnswer;


    @Column(nullable = false, name = "questionType")
    private QuestionType type;
}
