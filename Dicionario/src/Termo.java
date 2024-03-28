abstract public class Termo {
    private String termo;
    private String traducao;

    public Termo(String termo, String traducao) {
        this.termo = termo;
        this.traducao = traducao;
    }


    public String getTraducao() {return traducao;}

    public String getTermo(){return termo;}
}
