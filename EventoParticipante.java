import java.util.ArrayList;
import java.util.List;

public class EventoParticipante {
    private int idEvento;  // Armazena o ID do Evento
    private int idParticipante;  // Armazena o ID do Participante

    // Lista para armazenar a relação entre eventos e participantes (somente IDs)
    static List<EventoParticipante> eventosParticipantes = new ArrayList<>();

    // Construtor que recebe os IDs para criar a associação
    public EventoParticipante(int idEvento, int idParticipante) {
        this.idEvento = idEvento;
        this.idParticipante = idParticipante;
        eventosParticipantes.add(this);  // Adiciona a associação na lista
    }

    public int getIdEvento() {
        return idEvento;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    // Método estático para buscar as associações de um evento específico
    public static List<Integer> buscarParticipantesPorEvento(int idEvento) {
        List<Integer> participantesIds = new ArrayList<>();
        for (EventoParticipante eventoParticipante : eventosParticipantes) {
            if (eventoParticipante.getIdEvento() == idEvento) {
                participantesIds.add(eventoParticipante.getIdParticipante());
            }
        }
        return participantesIds;
    }

    // Método estático para buscar os eventos de um participante específico
    public static List<Integer> buscarEventosPorParticipante(int idParticipante) {
        List<Integer> eventosIds = new ArrayList<>();
        for (EventoParticipante eventoParticipante : eventosParticipantes) {
            if (eventoParticipante.getIdParticipante() == idParticipante) {
                eventosIds.add(eventoParticipante.getIdEvento());
            }
        }
        return eventosIds;
    }
}
