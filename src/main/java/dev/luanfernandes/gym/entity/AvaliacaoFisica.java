package dev.luanfernandes.gym.entity;

import java.time.LocalDateTime;

public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    private double peso;

    private double altura;

}
