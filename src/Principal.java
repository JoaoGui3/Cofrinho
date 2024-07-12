import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        // Exemplo de adição de moedas
        cofrinho.adicionarMoeda(new Dolar(10));
        cofrinho.adicionarMoeda(new Euro(15));
        cofrinho.adicionarMoeda(new Real(20));

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
                    // Implemente a adição de moeda aqui
                    System.out.println("Opção 1 selecionada. Adicione a moeda desejada.");
                    break;
                case 2:
                    // Implemente a remoção de moeda aqui
                    System.out.println("Opção 2 selecionada. Remova a moeda desejada.");
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