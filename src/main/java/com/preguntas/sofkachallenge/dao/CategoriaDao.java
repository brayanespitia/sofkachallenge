package com.preguntas.sofkachallenge.dao;

import com.preguntas.sofkachallenge.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao  extends JpaRepository <CategoriaEntity, Long> {
}
