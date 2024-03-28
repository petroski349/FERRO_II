abstract public class Contribuinte  implements Tributacao{
    private String nome;
    private int documento;
    private float rendaBruta;
    private String sexo;

    public Contribuinte(String nome, String sexo, int documento, float rendaBruta) {
        this.nome = nome;
        this.sexo = sexo;
        this.documento = documento;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public int getDocumento() {
        return documento;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public String getSexo() {
        return sexo;
    }
}
