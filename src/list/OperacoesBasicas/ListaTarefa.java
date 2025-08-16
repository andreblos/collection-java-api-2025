package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<Tarefas>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasList){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("1");
        listaTarefa.adicionarTarefa("1");
        listaTarefa.adicionarTarefa("2");

        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("1");

        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
