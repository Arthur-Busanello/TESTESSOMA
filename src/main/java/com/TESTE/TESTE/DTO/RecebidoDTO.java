package com.TESTE.TESTE.DTO;

import com.TESTE.TESTE.Entity.Recebido;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RecebidoDTO {

    private List<Double> numeros;

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
