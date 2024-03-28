public class PessoaJuridica extends Contribuinte{
    PessoaJuridica(String nome,String sexo, int documento, float rendaBruta){
        super(nome,sexo,documento,rendaBruta);
    };

    @Override
    public float calcImposto() {
       return getRendaBruta()*10/100;
    }
}


//A classe 'PessoaJuridica' deve ser declarada abstrata
// ou implementar o método abstrato 'calcImposto()' em 'Tributacao'