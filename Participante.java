import java.util.ArrayList;

public class Participante extends Pessoa {
    private String telefone;
    static ArrayList<Participante> participantes = new ArrayList<>();

    public Participante(int idPessoa, String nomePessoa, String telefone) {
        super(idPessoa, nomePessoa);
        this.telefone = telefone;
        participantes.add(this);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    static void verificaId(int id) throws Exception {
        for (Participante participantePrint : participantes) {
            if (participantePrint.getIdPessoa() == id) {
                return;
            }
        }
        throw new Exception("Participante não encontrado");
    }
    
    static boolean verificaIdRepetido(int id) {
        for (Participante participantePrint : participantes) {
            if (participantePrint.getIdPessoa() == id) {
                return true;
            }
        }
        return false;
    }
    
    static Participante buscaParticipante(int id) {
        for (Participante participantePrint : participantes) {
            if (participantePrint.getIdPessoa() == id) {
                return participantePrint;
            }
        }
        return null;
    }
}
