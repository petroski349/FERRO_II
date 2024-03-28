import java.util.ArrayList;
public class GrupoDeContribuintes {

    ArrayList<Contribuinte> contribuinte;

    public GrupoDeContribuintes() {
        this.contribuinte = new ArrayList();
    }

    boolean addContribuinte(Contribuinte contribuinte){
        for(Contribuinte i: this.contribuinte)
            if(i == contribuinte)
                return false;
        return this.contribuinte.add(contribuinte);
    }
    float impostoDevidoColecao(){
        float soma = 0;
        for(Contribuinte i: contribuinte)
            soma+= i.calcImposto();
        return soma;
    }
    float sexoFeminino(){
        int soma= 0, fem = 0;
        for (Contribuinte i: contribuinte){
            soma++;
            if(i.getSexo() == "Feminino")
                fem++;
        }
        return (float)100*fem/soma;
    }
}
