package com.preguntas.sofkachallenge.service;

import com.preguntas.sofkachallenge.entity.CategoriaEntity;
import com.preguntas.sofkachallenge.entity.PreguntaEntity;

import java.util.List;

public interface PreguntaService {

    Long crear (PreguntaEntity preguntaEntity);

    List<PreguntaEntity> listarTodo();

}
