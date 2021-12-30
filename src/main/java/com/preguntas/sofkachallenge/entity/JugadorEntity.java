package com.preguntas.sofkachallenge.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="jugador")
public class JugadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int puntaje;
}
