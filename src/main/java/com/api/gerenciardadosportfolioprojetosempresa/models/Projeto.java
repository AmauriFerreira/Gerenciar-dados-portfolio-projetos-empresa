package com.api.gerenciardadosportfolioprojetosempresa.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nomeProjeto;
        private String dataInicio;
        private String gerenteResponsavel;
        private String dataPrivisaoTermino;
        private String dataRealTermino;
        private String orcamentoTotal;
        @Enumerated(value = EnumType.STRING)
        private DescricaoStatus descricaoStatus;


        @Deprecated
        public Projeto(String DescricaoStatus) {
                this.descricaoStatus = descricaoStatus;

        }
}
