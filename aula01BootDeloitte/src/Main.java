import java.util.Scanner;

// BootCamp Deloitte - JAVA 2026

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[10];
        int indice = 0;


        /* int[] valores = new int[10];
        String[] itens = new String[10];
        String[] categorias = new String[10]; */

        int escolha;

        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("----- Bem vindo a área de gerenciamento da GoPizza! -----");
            System.out.println("-----            1. Adicionar Item                  -----");
            System.out.println("-----            2. Consultar Item                  -----");
            System.out.println("-----            3. Atualizar Item                  -----");
            System.out.println("-----            4. Remover Item                    -----");
            System.out.println("-----            5. Sair                            -----");
            System.out.println("---------------------------------------------------------");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:

                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    float preco = Float.parseFloat(scanner.nextLine());

                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();

                    produtos[indice] = new Produto(nome, preco, categoria);
                    indice++;

                    System.out.println("Produto cadastrado com sucesso!");


                    /* System.out.println("Digite o nome do item: ");
                    itens[0] = scanner.nextLine();

                    /* System.out.println("Digite o valor do item: ");
                    valores[0] = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a categoria do item: ");
                    categorias[0] = scanner.nextLine(); */
                    break;

                case 2:
                    System.out.println("Digite o número do produto que deseja consultar: ");
                    int numero = Integer.parseInt(scanner.nextLine());

                    // Ajuste porque o usuário digita 1, 2, 3... e o array começa em 01
                    int posicao = numero - 1;

                    if (posicao < 0 || posicao >= produtos.length || produtos[posicao] == null) {
                        System.out.println("Não há nenhum produto com este número.");
                    } else {
                        System.out.println("Nome do produto: " + produtos[posicao].nome);
                        System.out.println("Preço do produto: " + produtos[posicao].preco);
                        System.out.println("Categoria do produto: " + produtos[posicao].categoria);
                    }

                    /* System.out.println("Digite o número do item que deseja consultar: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    if (itens[numero -1] == null){
                        System.out.println("Não há nenhum item com este número adicionado.");
                    } else {
                        System.out.println("Nome do produto: " + itens[numero - 1]);
                        System.out.println("Valor do produto: " + valores[numero - 1]);
                        System.out.println("Categoria do produto: " + categorias[numero - 1]);
                    } */
                    break;

                case 3:
                    System.out.print("Digite o número do produto que deseja alterar: ");
                    numero = Integer.parseInt(scanner.nextLine());

                    posicao = numero - 1;

                    if (posicao < 0 || posicao >= produtos.length || produtos[posicao] == null) {
                        System.out.println("Não há nenhum produto com este número.");
                    } else {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();

                        System.out.print("Digite o novo preço: ");
                        float novoPreco = Float.parseFloat(scanner.nextLine());

                        System.out.print("Digite a nova categoria: ");
                        String novaCategoria = scanner.nextLine();

                        produtos[posicao].nome = novoNome;
                        produtos[posicao].preco = novoPreco;
                        produtos[posicao].categoria = novaCategoria;

                        System.out.println("Produto alterado com sucesso!");
                    }

                    /* System.out.println("Digite o número do item que deseja alterar: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o novo nome: ");
                    itens[numero - 1] = scanner.nextLine();

                    System.out.println("Digite o novo valor: ");
                    valores[numero - 1] = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a nova categoria: ");
                    categorias[numero - 1] = scanner.nextLine(); */
                    break;

                case 4:
                    System.out.print("Digite o número do produto que deseja remover: ");
                    numero = Integer.parseInt(scanner.nextLine());

                    posicao = numero - 1;

                    if (posicao < 0 || posicao >= produtos.length || produtos[posicao] == null) {
                        System.out.println("Não há nenhum produto com este número.");
                    } else {
                        produtos[posicao] = null;
                        System.out.println("Produto removido com sucesso!");
                    }

                    /* System.out.println("Digite o número do item que deseja remover: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    itens[numero - 1] = null;
                    valores[numero - 1] = 0;
                    categorias[numero - 1] = null;

                    System.out.println("Item removido!"); */
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 5);

        scanner.close();
    }
}