package com.example.logisticaservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SqsMessage {

    private List<String> produtos;

    private String endereco;

    private String idCliente;

    private String idVenda;

    public SqsMessage() {
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdVenda() {
        return idVenda;
    }
}
