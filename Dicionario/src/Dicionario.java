import java.util.ArrayList;

public class Dicionario implements IDic {

    ArrayList<Termo>termo;

    Dicionario(){
        termo = new ArrayList();
    }
    @Override
    public void inserir(Termo ter) {
        boolean flag = true;
        for(Termo i: termo )
            if(i == ter)
                flag = false;
        if(flag = true)
            this.termo.add(ter);
    }
    @Override
    public String traduzir(String palavra){
        for(Termo i: termo)
            if(i.getTermo() == palavra)
                return i.getTraducao();
        return("");
    }

    @Override
    public boolean remover(String palavra) {
        for(Termo i: termo)
            if(i.getTermo() == palavra)
                return termo.remove(i);
        return false;
    }
}
