package dev.luanfernandes.gym.service;

import dev.luanfernandes.gym.entity.AvaliacaoFisica;
import dev.luanfernandes.gym.dto.AvaliacaoFisicaForm;
import dev.luanfernandes.gym.dto.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
