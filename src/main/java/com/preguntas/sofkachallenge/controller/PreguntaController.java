package com.preguntas.sofkachallenge.controller;


import com.preguntas.sofkachallenge.entity.PreguntaEntity;
import com.preguntas.sofkachallenge.entity.RespuestaEntity;
import com.preguntas.sofkachallenge.service.PreguntaService;
import com.preguntas.sofkachallenge.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pregunta")
public class PreguntaController {


    @Autowired
    public PreguntaService preguntaService;


    @GetMapping("/registrar")
    public  String registro(Map<String, Object> model) {
        PreguntaEntity preguntaEntity = new PreguntaEntity();
        model.put("preguntaEntity", preguntaEntity);
        model.put("titulo", "formulario pregunta");
        return "regPregunta";
    }

    @PostMapping("/registrar")
    public String registrar(@Validated PreguntaEntity preguntaEntity, BindingResult result, Model model, RedirectAttributes flash, @RequestParam(value = "respuesta1")String respuesta1){
        RespuestaEntity resp = new RespuestaEntity();
        resp.setDescripcion("respuestica");
        resp.setId(1L);
      //  resp.setPregunta(preguntaEntity);
        resp.setEsCorrecta(true);
        List <RespuestaEntity> respuestas= new ArrayList<>();
        respuestas.add(resp);
        preguntaEntity.setRespuestas(respuestas);

        preguntaService.crear(preguntaEntity);
        flash.addAttribute("sucess","La pregunta a sido registrada");
        return "redirect:/pregunta/registrar";

    }

}
