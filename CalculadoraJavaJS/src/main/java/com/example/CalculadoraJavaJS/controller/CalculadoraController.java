package com.example.CalculadoraJavaJS.controller.;

import com.example.CalculadoraJavaJS.dto.*;
import com.example.CalculadoraJavaJS.service.CalculadoraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/somar")
    public OperacaoResponse somar(@RequestBody com.seuprojeto.calculadora.dto.OperacaoRequest request) {
        return new OperacaoResponse(
                service.somar(request.getNumero1(), request.getNumero2())
        );
    }

    @PostMapping("/subtrair")
    public OperacaoResponse subtrair(@RequestBody com.seuprojeto.calculadora.dto.OperacaoRequest request) {
        return new OperacaoResponse(
                service.subtrair(request.getNumero1(), request.getNumero2())
        );
    }

    @PostMapping("/multiplicar")
    public OperacaoResponse multiplicar(@RequestBody com.seuprojeto.calculadora.dto.OperacaoRequest request) {
        return new OperacaoResponse(
                service.multiplicar(request.getNumero1(), request.getNumero2())
        );
    }

    @PostMapping("/dividir")
    public OperacaoResponse dividir(@RequestBody com.seuprojeto.calculadora.dto.OperacaoRequest request) {
        return new OperacaoResponse(
                service.dividir(request.getNumero1(), request.getNumero2())
        );
    }
}