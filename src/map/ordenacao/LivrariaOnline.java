package map.ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    private HashMap<String, Livro> livraria;

    public LivrariaOnline(){
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, 
    String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livraria.entrySet()){
            if (entry.getValue().getNome().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            livraria.remove(chavesRemover);   
            }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosporAutor = new LinkedHashMap<>();
        for(Map.Entry<String,Livro> entry : livraria.entrySet()){
            Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosporAutor.put(entry.getKey(), livro);
            }
        }
        return livrosporAutor;
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livraria.isEmpty()) {
            for (Livro livro : livraria.values()){
                if(livro.getPreco() > precoMaisAlto){
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else{
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto){
                Livro livroComPrecoMaisAlto = livraria.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBaixo = Double.MAX_VALUE;

    if (!livraria.isEmpty()) {
      for (Livro livro : livraria.values()) {
        if (livro.getPreco() < precoMaisBaixo) {
          precoMaisBaixo = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livraria.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisBaixo) {
        Livro livroComPrecoMaisBaixo = livraria.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBaixo);
      }
    }
    return livrosMaisBaratos;
  }

}
