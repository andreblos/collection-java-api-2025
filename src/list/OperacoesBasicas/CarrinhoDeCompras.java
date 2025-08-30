package list.OperacoesBasicas;

import  list.OperacoesBasicas.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarrinhoDeCompras {

    private List<Item> lista;
    public CarrinhoDeCompras() {
        lista = new ArrayList<>();
    }
    public void adicionar(String nome, double valor, int quantidade) {
        lista.add(new Item(nome, valor, quantidade));
    }
    public void remover(String nome) {
        List<Item> listaRemover = new ArrayList<>();
        if (!lista.isEmpty()) {
            for (Item item : lista) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    listaRemover.add(item);
                }
            }
            lista.removeAll(listaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public double calcularTotal() {
        double total = 0.0;
        if (!lista.isEmpty()) {
            for (Item item : lista) {
                double valorItem = item.getPreco() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void printLista() {  if (!lista.isEmpty()) {
        System.out.println(this.lista);
    } else {
        System.out.println("A lista está vazia!");
    }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + lista +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionar("Lápis", 2d, 3);
        carrinhoDeCompras.adicionar("Lápis", 2d, 3);
        carrinhoDeCompras.adicionar("Caderno", 35d, 1);
        carrinhoDeCompras.adicionar("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.printLista();

        // Removendo um item do carrinho
        carrinhoDeCompras.remover("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.printLista();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotal());
    }
}
