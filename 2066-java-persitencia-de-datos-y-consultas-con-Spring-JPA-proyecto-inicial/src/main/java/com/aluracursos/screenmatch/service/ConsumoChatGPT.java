package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsumoChatGPT {
    public static String obtenerTraduccion(String texto){
        OpenAiService service = new OpenAiService("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");


        CompletionRequest requisicion= CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("tracude al espaniol el siguiente texto: "+ texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();
        var respuesta=service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }

}
