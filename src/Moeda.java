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
