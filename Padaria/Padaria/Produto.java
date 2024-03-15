public class Produto {
    int id;

    String nome;

    double preco;

    static int estoque;

    Tipo tipo;

    Produto(int id, String nome, double preco, int estoque, Tipo tipo){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
