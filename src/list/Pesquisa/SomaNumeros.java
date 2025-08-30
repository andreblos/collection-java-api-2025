package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;

public class SomaNumeros {

    private ArrayList<Integer> listaNum;

    public SomaNumeros() {
        listaNum = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNum.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!listaNum.isEmpty()){
            for (Integer numero : listaNum) {
                soma += numero;
            }
            return soma;
        } else {
            throw new RuntimeException("Nenhum numero encontrado");
        }
    }

    public int encontrarMaiorNumero(){
        if (listaNum.isEmpty()) {
            throw new IllegalStateException("Nenhum número encontrado");
        }
        // Evita erro com lista toda negativa
        return Collections.max(listaNum);

    }

    public int encontrarMenorNumero(){
        if (listaNum.isEmpty()) {
            throw new IllegalStateException("Nenhum número encontrado");
        }
        // Evita erro com lista toda negativa
        return Collections.min(listaNum);
    }

    public void exibirNumeros(){
        if (!listaNum.isEmpty()){
            for (Integer numero : listaNum) {
                System.out.println(numero);
            }
        }
    }


public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
}
}