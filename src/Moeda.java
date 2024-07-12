import java.util.ArrayList;

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

// Classe específica para Dólar
class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Estados Unidos");
    }

    @Override
    public double getValorEmReal() {
        return getValor() * 5.50; // Conversão fictícia para exemplo
    }
}

// Classe específica para Euro
class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "Europa");
    }

    @Override
    public double getValorEmReal() {
        return getValor() * 6.20; // Conversão fictícia para exemplo
    }
}

// Classe específica para Real (não precisa de conversão)
class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public double getValorEmReal() {
        return getValor(); // O Real já está em Reais
    }
}