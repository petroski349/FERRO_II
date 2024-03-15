public class Item {

    private  int quant;

    private double preco;

    private  Produto produto;

    Item(int quant, Produto produto){
        this.quant = quant;
        this.preco = produto.preco;
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Produto getProduto() {
        return produto;
    }
}
