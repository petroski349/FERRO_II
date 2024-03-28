public class PessoaFisica extends Contribuinte{

    PessoaFisica(String nome, String sexo, int documento, float rendaBruta){
        super(nome,sexo,documento,rendaBruta);
    }

    @Override
    public float calcImposto() {
        float porc= 0, parc = 0 ;
        if(getRendaBruta()>1400){
            if(getRendaBruta()>2100){
                if(getRendaBruta()>2800){
                    if(getRendaBruta()>3600){
                        porc = 30;
                        parc = 700;
                    }else{
                        porc = 25;
                        parc = 500;
                    }
                }else{
                    porc = 15;
                    parc = 270;
                }
            } else {
                porc = 10;
                parc = 100;
            }
        }


        return (getRendaBruta()*(porc/100))-parc;
    }
}
