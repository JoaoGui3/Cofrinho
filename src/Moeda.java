import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Moeda {
    private double valor;
    private String pais;

    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public abstract double getValorEmReal();

    public double getValor() {
        return valor;
    }

    public String getPais() {
        return pais;
    }
}

class Dolar extends Moeda {
    private double cambio;

    public Dolar(double valor, double cambio) {
        super(valor, "Estados Unidos");
        this.cambio = cambio;
    }

    @Override
    public double getValorEmReal() {
        return getValor() * cambio;
    }
}

class Euro extends Moeda {
    private double cambio;

    public Euro(double valor, double cambio) {
        super(valor, "Europa");
        this.cambio = cambio;
    }

    @Override
    public double getValorEmReal() {
        return getValor() * cambio;
    }
}

class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public double getValorEmReal() {
        return getValor(); // O Real já está em Reais
    }
}