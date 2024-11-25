public class Participante extends Pessoa {
    private String telefone;

    public Participante(int idPessoa, String nomePessoa, String telefone) {
        super(idPessoa, nomePessoa);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
