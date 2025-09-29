package com.spring.tarefa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tarefa.Repository.CasaRepository;
import com.spring.tarefa.entity.Casa;

@Service
public class CasaService {
 
    // Injeção de dependência do repositório de casas
    @Autowired
    private CasaRepository casaRepository;
 
    //Método para salvar uma casa
    public Casa save(Casa casa){
        return casaRepository.save(casa);
    }
 
    //Método para listar todas as casas
    public List<Casa> findAll(){
        return casaRepository.findAll();
    }

    //metodo para excluir uma casa pelo ID
    public void deleteById(Integer id){
        casaRepository.deleteById(id);
    }

    //metodo para buscar a casa pelo ID
    public Casa findById(Integer id){
        return casaRepository.findById(id).orElse(null);
    }
 
   
}


