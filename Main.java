import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n---- MENU PRINCIPAL ----");
            System.out.println("1. Cadastrar Local");
            System.out.println("2. Cadastrar Organizador");
            System.out.println("3. Cadastrar Participante");
            System.out.println("4. Cadastrar Evento");
            System.out.println("5. Listar Eventos");
            System.out.println("6. Enviar notificação");
            System.out.println("7. Listar Participantes de um Evento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("ID do Local: ");
                    int idLocal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descrição do Local: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Capacidade (vagas): ");
                    int capacidade = scanner.nextInt();
                    new Localidade(idLocal, descricao, capacidade);
                    System.out.println("Local cadastrado com sucesso!");
                    break;
                case 2:
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
                    break;
                case 5:
                    System.out.println("\n---- LISTA DE EVENTOS ----");
                    Evento.eventos.forEach(System.out::println);
                    break;
                case 6:
                    break;
                case 7:
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
