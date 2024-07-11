class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "Europa");
    }

    @Override
    public double getValorEmReal() {
        // Implemente a conversão para Real aqui (exemplo: 1 euro = 6,20 reais)
        return getValor() * 6.20;
    }
}