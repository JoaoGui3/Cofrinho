import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        moedas.remove(moeda);
    }

    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getValor() + " " + moeda.getPais());
        }
    }

    public double calcularValorTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValorEmReal();
        }
        return total;
    }
}
