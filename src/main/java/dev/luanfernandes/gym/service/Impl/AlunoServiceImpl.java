package dev.luanfernandes.gym.service.Impl;

import dev.luanfernandes.gym.entity.Aluno;
import dev.luanfernandes.gym.entity.AvaliacaoFisica;
import dev.luanfernandes.gym.dto.AlunoForm;
import dev.luanfernandes.gym.dto.AlunoUpdateForm;
import dev.luanfernandes.gym.service.AlunoService;

import java.util.List;

public class AlunoServiceImpl implements AlunoService {
    @Override
    public Aluno create(AlunoForm form) {
        return null;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return null;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
