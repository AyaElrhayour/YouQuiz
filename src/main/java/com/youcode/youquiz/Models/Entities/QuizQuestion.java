package com.youcode.youquiz.Models.Entities;


import com.youcode.youquiz.Models.Embd.QuizQuestionId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "quizQuestion")
public class QuizQuestion {

    @Id
    private QuizQuestionId  id;

    @Column(nullable = false, name = "timer")
    private int timer;
}
