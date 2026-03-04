package com.example.CalculadoraJavaJS.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void deveSomarCorretamente() {
        assertEquals(7.0, service.somar(5, 2));
    }

    @Test
    void deveSomarDecimais() {
        assertEquals(6.0, service.somar(2.5, 3.5));
    }

    @Test
    void deveSubtrairCorretamente() {
        assertEquals(6.0, service.subtrair(10, 4));
    }

    @Test
    void deveGerarResultadoNegativo() {
        assertEquals(-6.0, service.subtrair(4, 10));
    }

    @Test
    void deveMultiplicarPorZero() {
        assertEquals(0.0, service.multiplicar(5, 0));
    }

    @Test
    void deveDividirCorretamente() {
        assertEquals(5.0, service.dividir(10, 2));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.dividir(10, 0)
        );

        assertEquals("Divisão por zero não permitida", exception.getMessage());
    }
}