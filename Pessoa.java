public class Pessoa{
    private int idPessoa;
    private String nomePessoa;
    public Pessoa(
        int idPessoa,
        String nomePessoa
    ){
        this.idPessoa=idPessoa;
        this.nomePessoa=nomePessoa;
    }
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}