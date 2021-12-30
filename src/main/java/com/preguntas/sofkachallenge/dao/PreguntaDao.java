package com.preguntas.sofkachallenge.dao;


import com.preguntas.sofkachallenge.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaDao  extends JpaRepository <PreguntaEntity, Long> {
}
