package com.preguntas.sofkachallenge.controller;


import com.preguntas.sofkachallenge.entity.CategoriaEntity;
import com.preguntas.sofkachallenge.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;


    @PostMapping("/guardar")
    public  long guardarCategoria (@RequestBody CategoriaEntity categoriaEntity){
        return categoriaService.crear(categoriaEntity);

    }
    @GetMapping("/Listar")
    public List <CategoriaEntity> listar(){
        return  categoriaService.findAll();
    }

}
