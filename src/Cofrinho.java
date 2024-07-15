import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cofrinho {
    private List<Moeda> moedas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarMoeda() {
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o país de origem (Estados Unidos, Europa ou Brasil): ");
        String pais = scanner.nextLine();

        Moeda novaMoeda;
        if (pais.equalsIgnoreCase("Estados Unidos")) {
            System.out.print("Digite o valor de câmbio para Real: ");
            double cambio = scanner.nextDouble();
            novaMoeda = new Dolar(valor, cambio);
        } else if (pais.equalsIgnoreCase("Europa")) {
            System.out.print("Digite o valor de câmbio para Real: ");
            double cambio = scanner.nextDouble();
            novaMoeda = new Euro(valor, cambio);
        } else {
            novaMoeda = new Real(valor);
        }

        moedas.add(novaMoeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    public void removerMoeda() {
        System.out.print("Digite o país da moeda a ser removida: ");
        String paisRemover = scanner.nextLine();

        for (Moeda moeda : moedas) {
            if (moeda.getPais().equalsIgnoreCase(paisRemover)) {
                moedas.remove(moeda);
                System.out.println("Moeda removida com sucesso!");
                return;
            }
        }

        System.out.println("Moeda não encontrada no cofrinho.");
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