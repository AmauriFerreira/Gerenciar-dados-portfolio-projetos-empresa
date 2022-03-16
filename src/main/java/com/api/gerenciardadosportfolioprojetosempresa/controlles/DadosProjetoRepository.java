package com.api.gerenciardadosportfolioprojetosempresa.controlles;

import com.api.gerenciardadosportfolioprojetosempresa.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DadosProjetoRepository extends JpaRepository<Projeto, Long> {

  //  void deleteAllById(Long id);
}
