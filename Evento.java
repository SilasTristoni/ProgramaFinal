import java.util.ArrayList;

public class Evento {
    private int idEvento;
    private String nomeEvento;
    private String descricaoEvento;
    private String data;
    private int idLocalEvento;
    private int idOrganizadorEvento;
    private int totalParticipantes;
    static ArrayList<Evento> eventos = new ArrayList<>();

    public Evento(int idEvento, String nomeEvento, String descricaoEvento, String data, int idLocalEvento, int idOrganizadorEvento) throws Exception {
        for (Evento evento : eventos) {
            if (evento.idEvento == idEvento) {
                throw new Exception("Já existe um evento com este ID.");
            }
        }
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.data = data;
        this.idLocalEvento = idLocalEvento;
        this.idOrganizadorEvento = idOrganizadorEvento;
        this.totalParticipantes = 0;
        eventos.add(this);
    }

    public int getIdEvento() {
        return idEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public String getData() {
        return data;
    }

    public int getLocalEvento() {
        return idLocalEvento;
    }

    public int getOrganizadorEvento() {
        return idOrganizadorEvento;
    }

    public void adicionarParticipante() {
        totalParticipantes++;
    }

    static Evento buscarEventoPorId(int id) {
        for (Evento evento : eventos) {
            if (evento.idEvento == id) {
                return evento;
            }
        }
        return null;
    }

    static void validarIdEvento(int id) throws Exception {
        for (Evento eventoPrint : eventos) {
            if (eventoPrint.idEvento == id) {
                return;
            }
        }
        throw new Exception("Evento não encontrado");
    }
}
