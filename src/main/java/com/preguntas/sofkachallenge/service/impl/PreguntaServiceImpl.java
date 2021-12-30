package com.preguntas.sofkachallenge.service.impl;

import com.preguntas.sofkachallenge.dao.PreguntaDao;
import com.preguntas.sofkachallenge.entity.CategoriaEntity;
import com.preguntas.sofkachallenge.entity.PreguntaEntity;
import com.preguntas.sofkachallenge.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServiceImpl  implements PreguntaService {


    @Autowired
    PreguntaDao preguntaDao;

    @Override
    public Long crear(PreguntaEntity preguntaEntity) {
        preguntaDao.save(preguntaEntity);
        return preguntaEntity.getId();
    }

    @Override
    public List<PreguntaEntity> listarTodo() {
        return preguntaDao.findAll();
    }
}
