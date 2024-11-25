import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
    private int idEvento;
    private String nomeEvento;
    private String descricao;
    private LocalDate data;
    private Localidade local;
    private Organizador organizador;
    private ArrayList<Participante> participantes;
    static ArrayList<Evento> eventos = new ArrayList<>();

    public Evento(int idEvento, String nomeEvento, String descricao, LocalDate data, Localidade local, Organizador organizador) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
        this.organizador = organizador;
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

    public Localidade getLocal() {
        return local;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
}
