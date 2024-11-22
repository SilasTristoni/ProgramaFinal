import javax.management.Notification;

public class Organizador extends Pessoa {
    private String emailOrg;

    public Organizador(
        int idPessoa,
        String nomePessoa,
        String emailOrg,
        Notificacao notificacao    
    ){
        super(idPessoa, nomePessoa);
        this.emailOrg=emailOrg;
    }
    public String getEmailOrg() {
        return emailOrg;
    }
    public void setEmailOrg(String emailOrg) {
        this.emailOrg = emailOrg;
    }
}
