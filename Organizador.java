import java.util.ArrayList;

public class Organizador extends Pessoa {
    private String emailOrg;
    static ArrayList<Organizador> organizadores = new ArrayList<>();

    public Organizador(int idPessoa, String nomePessoa, String emailOrg) {
        super(idPessoa, nomePessoa);
        this.emailOrg = emailOrg;
        organizadores.add(this);
    }

    public String getEmailOrg() {
        return emailOrg;
    }

    public void setEmailOrg(String emailOrg) {
        this.emailOrg = emailOrg;
    }

    static void verificaId(int id) throws Exception {
        for (Organizador organizadorPrint : organizadores) {
            if (organizadorPrint.getIdPessoa() == id) {
                return;
            }
        }
        throw new Exception("Professor não encontrado");
    }
    
    /* Método que verifica se o id já existe, para evitar que os usuários cadastrem uma "chave primária" repetida, caso não exista o id que, o programa segue normalmente*/
    static boolean verificaIdRepetido(int id) {
        for (Organizador organizadorPrint : organizadores) {
            if (organizadorPrint.getIdPessoa() == id) {
                return true;
            }
        }
        return false;
    }
    
    /* Método que busca o professor pelo id e libera as informações para listagem do professor*/
    static Organizador buscaProfessor(int id) {
        for (Organizador organizadorPrint : organizadores) {
            if (organizadorPrint.getIdPessoa() == id) {
                return organizadorPrint;
            }
        }
        return null;
    }
}
