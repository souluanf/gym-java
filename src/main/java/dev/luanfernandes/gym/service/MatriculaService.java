package dev.luanfernandes.gym.service;

import dev.luanfernandes.gym.entity.Matricula;
import dev.luanfernandes.gym.dto.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
