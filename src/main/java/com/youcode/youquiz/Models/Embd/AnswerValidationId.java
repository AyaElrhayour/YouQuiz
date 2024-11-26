package com.youcode.youquiz.Models.Embd;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class AnswerValidationId implements Serializable {

    @Column(nullable = false, name = "answerId")
    private UUID answerId;

    @Column(nullable = false, name = "questionId")
    private UUID questionId;

    @Column(nullable = false, name = "QuizAssignment")
    private String quizAssignmentId;


}
