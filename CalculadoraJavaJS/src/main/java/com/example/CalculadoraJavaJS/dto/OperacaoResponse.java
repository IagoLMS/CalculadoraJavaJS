package com.example.CalculadoraJavaJS.dto;

public class OperacaoResponse {
    private double resultado;

    public OperacaoResponse(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}