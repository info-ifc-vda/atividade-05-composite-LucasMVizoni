import java.util.List;

public class TarefaComposta implements Tarefa {
    private String titulo;
    private List<Tarefa> tarefas;
    
    public TarefaComposta(String titulo, List<Tarefa> tarefas) {
        this.titulo = titulo;
        this.tarefas = tarefas;
    }

    @Override
    public void print(String problema) {
        System.out.println(problema + titulo);
        for(Tarefa tarefa: tarefas) {
            tarefa.print(problema + "| ");
        }
    }
}
