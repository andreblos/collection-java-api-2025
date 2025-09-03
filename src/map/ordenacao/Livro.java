package map.ordenacao;

public class Livro {

    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return double return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", preco=" + preco + "]";
    }
}
