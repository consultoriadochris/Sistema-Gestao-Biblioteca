import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Biblioteca {
    private Livro[] livros;
    private Utilizador[] utilizadores;
    private Emprestimo[] emprestimos;

    private int totalLivros;
    private int totalUtilizadores;
    private int totalEmprestimos;

    private static final int CAPACIDADE = 100;

    // Matriz: utilizadores x livros
    private int[][] historicoEmprestimos;

    public Biblioteca() {
        livros = new Livro[CAPACIDADE];
        utilizadores = new Utilizador[CAPACIDADE];
        emprestimos = new Emprestimo[CAPACIDADE];

        historicoEmprestimos = new int[CAPACIDADE][CAPACIDADE];

        totalLivros = 0;
        totalUtilizadores = 0;
        totalEmprestimos = 0;
    }

    // ==================== GESTÃO DE LIVROS ====================

    public void registarLivro(int id, String titulo, String autor,
                              int ano, int quantidade) {

        if (totalLivros >= CAPACIDADE) {
            System.out.println("Erro: Capacidade máxima de livros atingida.");
            return;
        }

        if (id <= 0 || buscarLivroPorId(id) != null) {
            System.out.println("Erro: ID de livro inválido ou já existente.");
            return;
        }

        if (titulo.trim().isEmpty() || autor.trim().isEmpty()) {
            System.out.println("Erro: Título e autor são obrigatórios.");
            return;
        }

        if (ano <= 0 || quantidade < 0) {
            System.out.println("Erro: Ano ou quantidade inválidos.");
            return;
        }

        livros[totalLivros] =
                new Livro(id, titulo, autor, ano, quantidade);

        totalLivros++;

        System.out.println("Livro registado com sucesso!");
    }

    public Livro buscarLivroPorId(int id) {
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i].getId() == id) {
                return livros[i];
            }
        }

        return null;
    }

    private int indiceLivroPorId(int id) {
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i].getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public void listarLivros() {
        if (totalLivros == 0) {
            System.out.println("Nenhum livro registado.");
            return;
        }

        System.out.println("\n========== CATÁLOGO DE LIVROS ==========");

        for (int i = 0; i < totalLivros; i++) {
            System.out.println(livros[i]);
        }

        System.out.println("=========================================\n");
    }

    public void pesquisarLivros(String termo) {
        boolean encontrado = false;

        termo = termo.trim().toLowerCase();

        System.out.println("\n========== RESULTADO DA PESQUISA ==========");

        for (int i = 0; i < totalLivros; i++) {

            if (livros[i].getTitulo().toLowerCase().contains(termo)
                    || livros[i].getAutor().toLowerCase().contains(termo)) {

                System.out.println(livros[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro encontrado.");
        }

        System.out.println("===========================================\n");
    }

    // ==================== GESTÃO DE UTILIZADORES ====================

    public void registarUtilizador(int id, String nome,
                                   String email, String contacto) {

        if (totalUtilizadores >= CAPACIDADE) {
            System.out.println(
                "Erro: Capacidade máxima de utilizadores atingida."
            );
            return;
        }

        if (id <= 0 || buscarUtilizadorPorId(id) != null) {
            System.out.println(
                "Erro: ID de utilizador inválido ou já existente."
            );
            return;
        }

        if (nome.trim().isEmpty()) {
            System.out.println("Erro: Nome é obrigatório.");
            return;
        }

        utilizadores[totalUtilizadores] =
                new Utilizador(id, nome, email, contacto);

        totalUtilizadores++;

        System.out.println("Utilizador registado com sucesso!");
    }

    public Utilizador buscarUtilizadorPorId(int id) {
        for (int i = 0; i < totalUtilizadores; i++) {
            if (utilizadores[i].getId() == id) {
                return utilizadores[i];
            }
        }

        return null;
    }

    private int indiceUtilizadorPorId(int id) {
        for (int i = 0; i < totalUtilizadores; i++) {
            if (utilizadores[i].getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public void listarUtilizadores() {
        if (totalUtilizadores == 0) {
            System.out.println("Nenhum utilizador registado.");
            return;
        }

        System.out.println(
            "\n========== UTILIZADORES REGISTADOS =========="
        );

        for (int i = 0; i < totalUtilizadores; i++) {
            System.out.println(utilizadores[i]);
        }

        System.out.println(
            "==============================================\n"
        );
    }

    // ==================== GESTÃO DE EMPRÉSTIMOS ====================

    public void efectuarEmprestimo(int idLivro, int idUtilizador) {

        if (totalEmprestimos >= CAPACIDADE) {
            System.out.println(
                "Erro: Capacidade máxima de empréstimos atingida."
            );
            return;
        }

        Livro livro = buscarLivroPorId(idLivro);
        Utilizador utilizador = buscarUtilizadorPorId(idUtilizador);

        if (livro == null) {
            System.out.println("Erro: Livro não encontrado.");
            return;
        }

        if (utilizador == null) {
            System.out.println("Erro: Utilizador não encontrado.");
            return;
        }

        if (livro.getQuantidadeDisponivel() <= 0) {
            System.out.println(
                "Erro: Livro indisponível para empréstimo."
            );
            return;
        }

        String dataAtual =
            LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
            );

        emprestimos[totalEmprestimos] =
            new Emprestimo(
                totalEmprestimos + 1,
                idLivro,
                idUtilizador,
                dataAtual
            );

        livro.setQuantidadeDisponivel(
            livro.getQuantidadeDisponivel() - 1
        );

        livro.incrementarEmprestimo();

        /*
         * A matriz utiliza as posições dos vetores
         * e não os IDs diretamente.
         */
        int posUtilizador = indiceUtilizadorPorId(idUtilizador);
        int posLivro = indiceLivroPorId(idLivro);

        if (posUtilizador >= 0 && posLivro >= 0) {
            historicoEmprestimos[posUtilizador][posLivro]++;
        }

        totalEmprestimos++;

        System.out.println(
            "Empréstimo efectuado com sucesso! ID do empréstimo: "
            + totalEmprestimos
        );
    }

    public void efectuarDevolucao(int idEmprestimo) {

        if (idEmprestimo <= 0
                || idEmprestimo > totalEmprestimos) {

            System.out.println("Erro: Empréstimo não encontrado.");
            return;
        }

        Emprestimo emp =
            emprestimos[idEmprestimo - 1];

        if (emp.isDevolvido()) {
            System.out.println(
                "Erro: Este empréstimo já foi devolvido."
            );
            return;
        }

        Livro livro =
            buscarLivroPorId(emp.getIdLivro());

        if (livro != null) {
            livro.setQuantidadeDisponivel(
                livro.getQuantidadeDisponivel() + 1
            );
        }

        String dataAtual =
            LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
            );

        emp.registarDevolucao(dataAtual);

        System.out.println(
            "Devolução registada com sucesso!"
        );
    }

    public void listarEmprestimos() {

        if (totalEmprestimos == 0) {
            System.out.println(
                "Nenhum empréstimo registado."
            );
            return;
        }

        System.out.println(
            "\n========== HISTÓRICO DE EMPRÉSTIMOS =========="
        );

        for (int i = 0; i < totalEmprestimos; i++) {
            System.out.println(emprestimos[i]);
        }

        System.out.println(
            "==============================================\n"
        );
    }

    // ==================== ESTATÍSTICAS ====================

    public void mostrarEstatisticas() {

        System.out.println("\n========== ESTATÍSTICAS ==========");

        System.out.println(
            "Total de livros no catálogo: "
            + totalLivros
        );

        System.out.println(
            "Total de utilizadores registados: "
            + totalUtilizadores
        );

        System.out.println(
            "Total de empréstimos efectuados: "
            + totalEmprestimos
        );

        if (totalLivros > 0) {

            Livro maisEmprestado = livros[0];

            for (int i = 1; i < totalLivros; i++) {

                if (livros[i].getTotalEmprestimos()
                        > maisEmprestado.getTotalEmprestimos()) {

                    maisEmprestado = livros[i];
                }
            }

            System.out.println(
                "Livro mais emprestado: "
                + maisEmprestado.getTitulo()
                + " ("
                + maisEmprestado.getTotalEmprestimos()
                + " empréstimos)"
            );
        }

        System.out.println(
            "\n--- Matriz de Empréstimos [Utilizador x Livro] ---"
        );

        if (totalUtilizadores == 0 || totalLivros == 0) {

            System.out.println(
                "Não existem dados suficientes para apresentar a matriz."
            );

        } else {

            System.out.print("       ");

            for (int j = 0; j < totalLivros; j++) {
                System.out.printf(
                    "L%-4d",
                    livros[j].getId()
                );
            }

            System.out.println();

            for (int i = 0; i < totalUtilizadores; i++) {

                System.out.printf(
                    "U%-4d ",
                    utilizadores[i].getId()
                );

                for (int j = 0; j < totalLivros; j++) {

                    System.out.printf(
                        "%-5d",
                        historicoEmprestimos[i][j]
                    );
                }

                System.out.println();
            }
        }

        System.out.println(
            "==================================\n"
        );
    }
}