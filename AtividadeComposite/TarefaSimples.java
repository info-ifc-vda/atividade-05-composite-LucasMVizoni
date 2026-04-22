public class TarefaSimples implements Tarefa{
    private String titulo;
    private String descricao;
    private String prazo;

    public TarefaSimples(String titulo, String descricao, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    @Override
    public void print(String problema) {
        System.out.println(problema + titulo);
    }
}
