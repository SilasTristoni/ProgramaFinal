import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
    private int idEvento;
    private String nomeEvento;
    private String descricao;
    private LocalDate data;
    private int idLocalEvento;
    private int idOrganizadorEvento;
    private ArrayList<Participante> participantes;
    static ArrayList<Evento> eventos = new ArrayList<>();

    public Evento(int idEvento, String nomeEvento, String descricao, LocalDate data, int idLocalEvento, int idOrganizadorEvento) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.data = data;
        this.idLocalEvento = idLocalEvento;
        this.idOrganizadorEvento = idOrganizadorEvento;
        this.participantes = new ArrayList<>();
        eventos.add(this); // Adiciona o evento à lista estática
    }

    public int getIdEvento() {
        return idEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public int getLocal() {
        return idOrganizadorEvento;
    }

    public int getOrganizador() {
        return idLocalEvento;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
}
