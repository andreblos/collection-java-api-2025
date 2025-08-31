package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        if (!palavras.contains(palavra)) {
            palavras.add(palavra);
        } else {
            throw new RuntimeException("A palavra já " + palavra + " já está no conjunto.");
        }
    }

    public void removerPalavra(String palavra) {
        if (palavras.contains(palavra)) {
            palavras.remove(palavra);
        } else {
            throw new RuntimeException("A palavra " + palavra + " não está no conjunto");
        }
    }

    public boolean verificarPalavra(String palavra){
     return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}


