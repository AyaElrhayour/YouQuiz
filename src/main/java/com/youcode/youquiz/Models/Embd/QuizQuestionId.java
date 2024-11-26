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
public class QuizQuestionId implements Serializable {

    @Column(nullable = false, name = "quizId")
    private UUID quizId;

    @Column(nullable = false, name = "questionId")
    private UUID questionId;
}
