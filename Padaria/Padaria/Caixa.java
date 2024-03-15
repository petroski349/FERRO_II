import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Caixa {

    static private int id = 0;
    private List<Comanda> comanda;

    Caixa(){
        id=0;
        comanda = new ArrayList();
    }
    boolean novaComanda(String cliente){
        Comanda aux = new Comanda(++id,cliente );
        for (Comanda i: comanda){
            if(i.getCliente() == cliente)
                return false;
        }
        return comanda.add(aux);
    }

    public Comanda getComanda(int id) {
        for(Comanda i: comanda){
            if(i.getId()==id)
                return i;
        }
        return null;
    }
    void pagarComanda(int id){
        boolean x= false;
        for(Comanda i: comanda){
            if(i.getId() == id)
                comanda.remove(i);
        }
    }

    public static int getId() {
        return id;
    }

    void relComanda(){
        for(Comanda i: comanda){
            System.out.print(i.getId()+" ");
            System.out.println(i.getCliente());
        }
    }
}
