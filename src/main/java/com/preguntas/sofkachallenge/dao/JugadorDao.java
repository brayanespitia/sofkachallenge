package com.preguntas.sofkachallenge.dao;


import com.preguntas.sofkachallenge.entity.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JugadorDao  extends JpaRepository <JugadorEntity, Long> {
}
