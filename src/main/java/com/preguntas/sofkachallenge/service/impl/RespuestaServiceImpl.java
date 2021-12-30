package com.preguntas.sofkachallenge.service.impl;


import com.preguntas.sofkachallenge.dao.PreguntaDao;
import com.preguntas.sofkachallenge.dao.RespuestaDao;
import com.preguntas.sofkachallenge.entity.PreguntaEntity;
import com.preguntas.sofkachallenge.entity.RespuestaEntity;
import com.preguntas.sofkachallenge.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaServiceImpl  implements RespuestaService {

    @Autowired
    RespuestaDao respuestaDao;



    @Override
    public Long crear(RespuestaEntity respuestaEntity) {
        respuestaDao.save(respuestaEntity);
        return respuestaEntity.getId();
    }

    @Override
    public List<RespuestaEntity> listar() {
        return null;
    }
}
