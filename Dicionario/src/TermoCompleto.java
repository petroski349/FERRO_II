import java.util.ArrayList;
public class TermoCompleto extends Termo{

    private ArrayList<String> sinonimo;
    TermoCompleto(String termo,String traducao,ArrayList<String> sinonimo){
        super(termo,traducao);
        this.sinonimo = sinonimo;

    }

    ArrayList<String> getSinonimo() {return sinonimo;}
}
