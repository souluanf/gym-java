package dev.luanfernandes.gym.service;

import dev.luanfernandes.gym.entity.Aluno;
import dev.luanfernandes.gym.entity.AvaliacaoFisica;
import dev.luanfernandes.gym.dto.AlunoForm;
import dev.luanfernandes.gym.dto.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
