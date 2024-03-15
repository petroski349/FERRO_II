import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Comanda {

    private int id;

    private LocalDate Data;

    private String cliente;

    private ArrayList<Item> item;

    Comanda(int id, String cliente){
        this.id = id;
        this.Data = LocalDate.now();
        this.cliente = cliente;
        item = new ArrayList();
    }

    boolean addItem(int quant, Produto produto){
        if(produto.getEstoque()>=quant && quant>0){
            for(Item i: item){
                if(i.getProduto()==produto){
                    i.setPreco(i.getQuant()+quant);
                    quant = 0;
                    return true;
                }
            }
            if(quant>0){
                Item aux = new Item(quant,produto);
                item.add(aux);
                return true;
            }
        }
        return false;
    }

    double totalizar(){
          double soma =0;
          for(Item i: item)
              soma+=i.getPreco()*i.getQuant();
          return soma;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {

        return Data;
    }

    public String getCliente() {
        return cliente;
    }

}
