import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo) {
        tarefas.add(new Tarefa(titulo));
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    public void concluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).concluir();
        }
    }
}
