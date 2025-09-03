package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private HashMap<String, Integer>  palavras;

    public ContagemPalavras(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (palavras.containsKey(palavra)){
            palavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
            for (Map.Entry<String, Integer> entry :palavras.entrySet()){
                if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
                }
            }
            return linguagemMaisFrequente;
        }
        
    }



