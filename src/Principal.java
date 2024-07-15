import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular valor total em reais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cofrinho.adicionarMoeda();
                    break;
                case 2:
                    cofrinho.removerMoeda();
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    System.out.println("Valor total em reais: " + cofrinho.calcularValorTotalEmReal());
                    System.out.println("\n1. Voltar ao menu principal");
                    System.out.println("0. Encerrar o programa");
                    System.out.print("Escolha uma opção: ");
                    int escolha = scanner.nextInt();
                    if (escolha == 0) {
                        System.out.println("Encerrando o programa.");
                        opcao = 0; // Encerra o loop
                    }
                    // Caso escolha 1, o loop continua e o menu será exibido novamente
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}