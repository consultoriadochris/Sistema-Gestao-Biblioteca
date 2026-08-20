
import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            System.out.print("Escolha uma opção: ");
            opcao = lerInteiro();
            processarOpcao(opcao);
        } while (opcao != 0);

        System.out.println("Sistema encerrado. Obrigado!");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE GESTÃO DE BIBLIOTECA          ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  1. Registar Livro                           ║");
        System.out.println("║  2. Listar Catálogo                          ║");
        System.out.println("║  3. Pesquisar Livro                          ║");
        System.out.println("║  4. Registar Utilizador                      ║");
        System.out.println("║  5. Listar Utilizadores                      ║");
        System.out.println("║  6. Efectuar Empréstimo                      ║");
        System.out.println("║  7. Efectuar Devolução                       ║");
        System.out.println("║  8. Listar Empréstimos                       ║");
        System.out.println("║  9. Estatísticas                             ║");
        System.out.println("║  0. Sair                                     ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    public static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1: registarLivro(); break;
            case 2: biblioteca.listarLivros(); break;
            case 3: pesquisarLivro(); break;
            case 4: registarUtilizador(); break;
            case 5: biblioteca.listarUtilizadores(); break;
            case 6: efectuarEmprestimo(); break;
            case 7: efectuarDevolucao(); break;
            case 8: biblioteca.listarEmprestimos(); break;
            case 9: biblioteca.mostrarEstatisticas(); break;
            case 0: break;
            default: System.out.println("Opção inválida!");
        }
    }

    public static void registarLivro() {
        System.out.print("ID do livro: ");
        int id = lerInteiro();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de publicação: ");
        int ano = lerInteiro();
        System.out.print("Quantidade disponível: ");
        int quantidade = lerInteiro();
        biblioteca.registarLivro(id, titulo, autor, ano, quantidade);
    }

    public static void pesquisarLivro() {
        System.out.print("Digite o título ou autor a pesquisar: ");
        String termo = scanner.nextLine();
        biblioteca.pesquisarLivros(termo);
    }

    public static void registarUtilizador() {
        System.out.print("ID do utilizador: ");
        int id = lerInteiro();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Contacto: ");
        String contacto = scanner.nextLine();
        biblioteca.registarUtilizador(id, nome, email, contacto);
    }

    public static void efectuarEmprestimo() {
        System.out.print("ID do livro: ");
        int idLivro = lerInteiro();
        System.out.print("ID do utilizador: ");
        int idUtilizador = lerInteiro();
        biblioteca.efectuarEmprestimo(idLivro, idUtilizador);
    }

    public static void efectuarDevolucao() {
        System.out.print("ID do empréstimo: ");
        int idEmprestimo = lerInteiro();
        biblioteca.efectuarDevolucao(idEmprestimo);
    }

    public static int lerInteiro() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        return valor;
    }
}
