package com.example.logisticaservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;


@Component
public class VendaListener {

    private ObjectMapper mapper = new ObjectMapper();

    @SqsListener(value =  "https://sqs.sa-east-1.amazonaws.com/075970593276/vendas-logistica-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void recieveMessage(String record) throws Exception {

        SqsRecord sqsRecord = mapper.readValue(record, SqsRecord.class);
        SqsMessage sqsMessage = mapper.readValue(sqsRecord.getMessage(), SqsMessage.class);
        prepararEnvio(sqsMessage);
    }

    private void prepararEnvio(SqsMessage sqsMessage) {
        String mensagem = "Separar o(s) iten(s) da venda " + sqsMessage.getIdVenda() + " do cliente #" + sqsMessage.getIdCliente() + " para o endereço: " + sqsMessage.getEndereco() + ".";
        mensagem = mensagem.concat(" Os produtos foram: " + sqsMessage.getProdutos());
        System.out.println(mensagem);
    }

}