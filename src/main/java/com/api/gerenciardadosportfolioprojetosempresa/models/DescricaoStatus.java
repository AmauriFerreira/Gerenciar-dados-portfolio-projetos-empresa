package com.api.gerenciardadosportfolioprojetosempresa.models;

public enum DescricaoStatus {

    EmAnalise("Em Analise"),
    AnaliseRealizada("AnaliseRealizada"),
    AnaliseAprovada("Analise Aprovada"),
    Iniciado("Iniciado"),
    EmAndamento("Em Andamento"),
    Encerrado("Encerrado"),
    Cancelado(" Cancelado");

    private String nomeDescricaoStatus;

    private DescricaoStatus(String nomeDescricaoStatus) {
        this.nomeDescricaoStatus = nomeDescricaoStatus;
    }

    public String getDescricaoStatus() {
        return nomeDescricaoStatus;
    }

}




