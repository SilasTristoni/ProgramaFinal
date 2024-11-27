import java.util.ArrayList;
import java.util.List;

public class EventoParticipante {
    private int idEvento; 
    private int idParticipante;  

    static List<EventoParticipante> eventosParticipantes = new ArrayList<>();


    public EventoParticipante(Evento evento, Participante participante) {
        this.idEvento = evento.getIdEvento();
        this.idParticipante = participante.getIdPessoa();
        evento.addParticipante(this);
        participante.addEvento(this);
        eventosParticipantes.add(this);  
    }

    public int getIdEvento() {
        return idEvento;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

}
