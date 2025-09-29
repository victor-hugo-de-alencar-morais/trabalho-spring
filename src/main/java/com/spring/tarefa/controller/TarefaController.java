package com.spring.tarefa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

    @GetMapping
    public String index(Model model) {
        return "index";
    }
    
}
