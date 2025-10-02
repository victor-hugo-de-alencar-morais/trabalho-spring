package com.spring.tarefa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.tarefa.Service.CasaService;
import com.spring.tarefa.entity.Casa;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/casa")
public class CasaController {
 
    //Injeção de dependência da service de casas
    @Autowired
    private CasaService casaService;
 
    //Método para salvar uma casa
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Casa casa) {
        casaService.save(casa);
        return "redirect:/casa/listar";
    }
    //Método para listar todas as casas
    @GetMapping("/listar")
    public String listar(Model model){
        List<Casa> casas = casaService.findAll();
        model.addAttribute("casas", casas);
        return "Casa/listarCasa";
    }
    //Método para abrir o formulário de uma casa
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("casa", new Casa());
        return "Casa/formularioCasa";
    }

    //metodo para excluir uma casa 
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
    casaService.deleteById(id);
    return "redirect:/casa/listar";
}

    //metodo para abrir o formulario de edição de uma casa
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable("id") Integer id, Model model) {
        Casa casa = casaService.findById(id);
        model.addAttribute("casa", casa);
        return "Casa/formularioCasa";
    }
   
}
