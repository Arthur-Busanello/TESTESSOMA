package com.TESTE.TESTE.Entity;
import lombok.Getter;
import lombok.Setter;


public class Recebido {

    @Getter@Setter
    private double media;

    @Getter@Setter
    private double desvioPadrao;

    @Getter@Setter
    private double qntRecebido;

    @Getter@Setter
    private double mediana;

    public Recebido(){

    }

    public Recebido(double media, double desvioPadrao, double qntRecebido, double mediana) {
        this.media = media;
        this.desvioPadrao = desvioPadrao;
        this.qntRecebido = qntRecebido;
        this.mediana = mediana;
    }
}