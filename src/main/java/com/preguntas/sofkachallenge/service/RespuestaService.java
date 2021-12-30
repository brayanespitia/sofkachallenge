package com.preguntas.sofkachallenge.service;

import com.preguntas.sofkachallenge.entity.PreguntaEntity;
import com.preguntas.sofkachallenge.entity.RespuestaEntity;

import java.util.List;

public interface RespuestaService {

    Long crear (RespuestaEntity respuestaEntity);
    List <RespuestaEntity> listar();

}
