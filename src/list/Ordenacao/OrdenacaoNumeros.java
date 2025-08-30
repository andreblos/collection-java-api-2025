package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

    List<Integer> listaNumeros = new ArrayList<>();

    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List <Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }  else {
            throw new RuntimeException("A lista está vazia");
        }
    }


    public List<Integer> ordenarDescendente(){
        List <Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.reverse(numerosDescendente);
            return numerosDescendente;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        boolean numerosList = false;
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
}

public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Exibindo a lista
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    numeros.exibirNumeros();
}
}