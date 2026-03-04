package com.example.CalculadoraJavaJS.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    private double converterNumero(String valor) {

        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Número inválido");
        }

        valor = valor.replace(",", ".");

        try {
            double numero = Double.parseDouble(valor);

            if (Double.isNaN(numero) || Double.isInfinite(numero)) {
                throw new IllegalArgumentException("Número inválido");
            }

            return numero;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato numérico inválido");
        }
    }

    public double somar(String a, String b) {
        double n1 = converterNumero(a);
        double n2 = converterNumero(b);
        return n1 + n2;
    }

    public double subtrair(String a, String b) {
        double n1 = converterNumero(a);
        double n2 = converterNumero(b);
        return n1 - n2;
    }

    public double multiplicar(String a, String b) {
        double n1 = converterNumero(a);
        double n2 = converterNumero(b);
        return n1 * n2;
    }

    public double dividir(String a, String b) {
        double n1 = converterNumero(a);
        double n2 = converterNumero(b);

        if (n2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }

        return n1 / n2;
    }


    public double logaritmo(String valor) {
        double numero = converterNumero(valor);

        if (numero <= 0) {
            throw new IllegalArgumentException("Logaritmo só é permitido para números positivos");
        }

        return Math.log10(numero);
    }

    public double raizQuadrada(String valor) {
        double numero = converterNumero(valor);

        if (numero < 0) {
            throw new IllegalArgumentException("Raiz quadrada não permite número negativo");
        }

        return Math.sqrt(numero);
    }
}