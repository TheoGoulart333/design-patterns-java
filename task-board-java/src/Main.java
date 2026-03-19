import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Título da tarefa:");
                String titulo = sc.nextLine();
                board.adicionarTarefa(titulo);
            }

            else if (opcao == 2) {
                board.listarTarefas();
            }

            else if (opcao == 3) {
                System.out.println("Índice da tarefa:");
                int index = sc.nextInt();
                board.concluirTarefa(index);
            }

            else if (opcao == 0) {
                break;
            }
        }
    }
}
