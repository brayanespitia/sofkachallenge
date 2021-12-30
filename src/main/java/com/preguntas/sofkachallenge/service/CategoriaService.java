package com.preguntas.sofkachallenge.service;

import com.preguntas.sofkachallenge.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {

    Long crear (CategoriaEntity categoriaEntity);
    List <CategoriaEntity> findAll();
}
