public class TermoSimples extends Termo{

    private String pronuncia;

    TermoSimples(String termo,String traducao,String pronuncia){
        super(termo,traducao);
        this.pronuncia = pronuncia;
    }

    public String getPronuncia() {
        return pronuncia;
    }
}
