package com.preguntas.sofkachallenge.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name ="categorias")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_categoria")
    private Long id;

    private String nombreCategoria;
    private int dificultad;


}
