public class Emprestimo {
    private int id;
    private int idLivro;
    private int idUtilizador;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean devolvido;

    public Emprestimo(int id, int idLivro, int idUtilizador,
                      String dataEmprestimo) {

        this.id = id;
        this.idLivro = idLivro;
        this.idUtilizador = idUtilizador;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = "";
        this.devolvido = false;
    }

    public int getId() {
        return id;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void registarDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        this.devolvido = true;
    }

    @Override
    public String toString() {
        String status;

        if (devolvido) {
            status = "DEVOLVIDO em " + dataDevolucao;
        } else {
            status = "EM CURSO";
        }

        return String.format(
            "Emp. #%d | Livro ID: %d | Util. ID: %d | Empréstimo: %s | Status: %s",
            id,
            idLivro,
            idUtilizador,
            dataEmprestimo,
            status
        );
    }
}