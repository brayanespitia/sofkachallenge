package com.preguntas.sofkachallenge.service.impl;

import com.preguntas.sofkachallenge.dao.CategoriaDao;
import com.preguntas.sofkachallenge.entity.CategoriaEntity;
import com.preguntas.sofkachallenge.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    public CategoriaServiceImpl(CategoriaDao categoriaDao){
        this.categoriaDao =  categoriaDao;

    }


    @Autowired
    private CategoriaDao categoriaDao;



    @Override
    public Long crear(CategoriaEntity categoriaEntity) {
        categoriaDao.save(categoriaEntity);
        return categoriaEntity.getId();
    }

    @Override
    public List<CategoriaEntity> findAll() {

        return (List<CategoriaEntity>) categoriaDao.findAll() ;
    }
}
