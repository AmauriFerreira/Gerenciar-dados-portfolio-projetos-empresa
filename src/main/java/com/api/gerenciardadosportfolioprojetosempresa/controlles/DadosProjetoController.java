package com.api.gerenciardadosportfolioprojetosempresa.controlles;

import com.api.gerenciardadosportfolioprojetosempresa.models.Projeto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class DadosProjetoController {


    private final DadosProjetoRepository dadosProjetoRepository;


    @PostMapping(path = "/projeto")
        public Projeto saveProjeto(@RequestBody Projeto projeto){
            return dadosProjetoRepository.save(projeto);

    }

     @GetMapping("/buscar-projeto/{id}")
     public Optional<Projeto> buscarProjetoId(@PathVariable Long id){
        return dadosProjetoRepository.findById(id);
     }


    @GetMapping("listar-projetos")
    public List<Projeto> listarProjetos(){
        return dadosProjetoRepository.findAll();
    }

    @DeleteMapping("/excluir-projeto/{id}")
    public void excluirProjeto(@PathVariable Long id){
        dadosProjetoRepository.deleteById(id);

    
        }


    @PutMapping(path = "/projeto")
    @ResponseBody
    public ResponseEntity<Projeto> alterarProjeto(@RequestBody Projeto projetos) {
        Projeto projeto = dadosProjetoRepository.save(projetos);

        return new ResponseEntity<>(projeto,HttpStatus.CREATED);


    }
}
