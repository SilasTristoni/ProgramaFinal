import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n---- MENU PRINCIPAL ----");
            System.out.println("1. Cadastrar Local");
            System.out.println("2. Cadastrar Organizador");
            System.out.println("3. Cadastrar Participante");
            System.out.println("4. Cadastrar Evento");
            System.out.println("5. Listar Eventos");
            System.out.println("6. Enviar Notificação");
            System.out.println("7. Listar Participantes de um Evento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    // Cadastro de Local
                    System.out.print("ID do Local: ");
                    int idLocal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descrição do Local: ");
                    String descricaoLocal = scanner.nextLine();
                    System.out.print("Capacidade (vagas): ");
                    int capacidade = scanner.nextInt();
                    new Localidade(idLocal, descricaoLocal, capacidade);
                    System.out.println("Local cadastrado com sucesso!");
                    break;

                case 2:
                    // Cadastro de Organizador
                    System.out.print("ID do Organizador: ");
                    int idOrganizador = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Organizador: ");
                    String nomeOrganizador = scanner.nextLine();
                    System.out.print("E-mail do Organizador: ");
                    String emailOrganizador = scanner.nextLine();
                    new Organizador(idOrganizador, nomeOrganizador, emailOrganizador);
                    System.out.println("Organizador cadastrado com sucesso!");
                    break;

                case 3:
                    // Cadastro de Participante
                    System.out.print("ID do Participante: ");
                    int idParticipante = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Participante: ");
                    String nomeParticipante = scanner.nextLine();
                    System.out.print("Telefone do Participante: ");
                    String telefoneParticipante = scanner.nextLine();
                    new Participante(idParticipante, nomeParticipante, telefoneParticipante);
                    System.out.println("Participante cadastrado com sucesso!");
                    break;

                case 4:
                    // Cadastro de Evento
                    System.out.print("ID do Evento: ");
                    int idEvento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Evento: ");
                    String nomeEvento = scanner.nextLine();
                    System.out.print("Descrição do Evento: ");
                    String descricaoEvento = scanner.nextLine();
                    System.out.print("Data do Evento: ");
                    String dataEvento = scanner.nextLine();
                    System.out.print("ID do Local para o Evento: ");
                    int idLocalEvento = scanner.nextInt();
                    System.out.print("ID do Organizador do Evento: ");
                    int idOrganizadorEvento = scanner.nextInt();
                    try {
                        new Evento(idEvento, nomeEvento, descricaoEvento, dataEvento, idLocalEvento, idOrganizadorEvento);
                        System.out.println("Evento cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar evento: " + e.getMessage());
                    }
                    break;

                case 5:
                    // Listar Eventos
                    System.out.println("\n---- LISTA DE EVENTOS ----");
                    for (Evento eventoPrint : Evento.eventos) {
                        System.out.println("ID do Evento: " + eventoPrint.getIdEvento() + " | Nome: " + eventoPrint.getNomeEvento());
                    }
                    break;

                case 6:
                    // Enviar Notificação (opcional)
                    System.out.println("Notificação enviada!");
                    break;

                case 7:
                    // Listar Participantes de um Evento
                    System.out.print("Informe o ID do Evento para listar os Participantes: ");
                    int idEventoParaParticipantes = scanner.nextInt();
                    Evento evento = Evento.buscarEventoPorId(idEventoParaParticipantes);
                    if (evento != null) {
                        System.out.println("\nParticipantes do Evento: " + evento.getNomeEvento());
                        for (EventoParticipante eventoPartipantePrint : EventoParticipante.eventosParticipantes) {
                            if (eventoPartipantePrint.getIdEvento() == idEventoParaParticipantes) {
                                Participante participante = Participante.buscaParticipante(eventoPartipantePrint.getIdParticipante());
                                if (participante != null) {
                                    System.out.println("ID: " + participante.getIdPessoa() + " | Nome: " + participante.getNomePessoa());
                                }
                            }
                        }
                    } else {
                        System.out.println("Evento não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
