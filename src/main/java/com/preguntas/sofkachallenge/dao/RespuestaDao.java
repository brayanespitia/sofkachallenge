package com.preguntas.sofkachallenge.dao;


import com.preguntas.sofkachallenge.entity.RespuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaDao extends JpaRepository<RespuestaEntity, Long> {
}
