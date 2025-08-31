package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunos = new HashSet<>();

    public void adicionarAluno(String nome, int matricula, double nota){
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        for(Aluno aluno : alunos){
            if (aluno.getMatricula() == matricula){
                alunos.remove(aluno);
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunos);
    }
}
