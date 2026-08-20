public class Utilizador {
    private int id;
    private String nome;
    private String email;
    private String contacto;

    public Utilizador(int id, String nome, String email, String contacto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Nome: %-20s | Email: %-25s | Contacto: %s",
            id,
            nome,
            email,
            contacto
        );
    }
}