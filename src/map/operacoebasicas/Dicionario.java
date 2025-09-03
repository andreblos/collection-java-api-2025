package map.operacoebasicas;

import java.util.HashMap;

public class Dicionario {

    public HashMap<String,String> dicionario = new HashMap<>();
    
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisaPorPalavra(String palavra){
        String palavraPesquisa = null;
        if (!dicionario.isEmpty()){
            palavraPesquisa = palavra;
        }
        return palavraPesquisa;
    }
}
