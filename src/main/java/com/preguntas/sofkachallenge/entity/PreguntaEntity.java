package com.preguntas.sofkachallenge.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name ="preguntas")
public class PreguntaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Long id;
    private  String enunciado;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity id_categoria;



    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List <RespuestaEntity>respuestas;

    public PreguntaEntity() {
        this.respuestas = new ArrayList<RespuestaEntity>();
    }

    public void addRespuesta(RespuestaEntity respuesta){

         this.respuestas.add(respuesta);
     }

}
