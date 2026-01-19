import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];
        String[] itens = new String[10];
        String[] categorias = new String[10];

        int escolha;

        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("----- Bem vindo a área de gerenciamento da GoPizza! -----");
            System.out.println("-----            1. Adicionar Item                  -----");
            System.out.println("-----            2. Consultar Item                  -----");
            System.out.println("-----            3. Atualizar Item                  -----");
            System.out.println("-----            4. Remover Item                    -----");
            System.out.println("-----            0. Sair                            -----");
            System.out.println("---------------------------------------------------------");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    System.out.println("Digite o nome do item: ");
                    itens[0] = scanner.nextLine();

                    System.out.println("Digite o valor do item: ");
                    valores[0] = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a categoria do item: ");
                    categorias[0] = scanner.nextLine();
                    break;

                case 2:
                    System.out.println("Digite o número do item: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(itens[numero - 1]);
                    System.out.println(valores[numero - 1]);
                    System.out.println(categorias[numero - 1]);
                    break;

                case 3:
                    System.out.println("Digite o número do item que deseja alterar: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o novo nome: ");
                    itens[numero - 1] = scanner.nextLine();

                    System.out.println("Digite o novo valor: ");
                    valores[numero - 1] = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a nova categoria: ");
                    categorias[numero - 1] = scanner.nextLine();
                    break;

                case 4:
                    System.out.println("Digite o número do item que deseja remover: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    itens[numero - 1] = null;
                    valores[numero - 1] = 0;
                    categorias[numero - 1] = null;

                    System.out.println("Item removido!");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 0);

        scanner.close();
    }
}