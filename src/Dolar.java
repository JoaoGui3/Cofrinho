class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Estados Unidos");
    }

    @Override
    public double getValorEmReal() {
        // Implemente a conversão para Real aqui (exemplo: 1 dólar = 5,50 reais)
        return getValor() * 5.50;
    }
}
