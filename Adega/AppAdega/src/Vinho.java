import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Vinho {
    private String tipo, marca;
    private int volume;
    private LocalDate dtprod;
    private double valor;

    public Vinho(String tipo, String marca, int volume, LocalDate dtprod, double valor) {
        setTipo(tipo);
        this.marca = marca;
        setVolume(volume);
        this.dtprod = dtprod;
        setValor(valor);
    }

    public Vinho() {
        this("branco","",0,LocalDate.now(),0);
    }

    public Vinho(String tipo, String marca, int volume) {
        this(tipo,marca,volume,LocalDate.now(),0);
    }


    public java.lang.String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("branco") || tipo.equalsIgnoreCase("tinto"))
           this.tipo = tipo.toLowerCase();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>0)
            this.volume = volume;
    }

    public LocalDate getDtprod() {
        return dtprod;
    }

    public void setDtprod(LocalDate dtprod) {
        this.dtprod = dtprod;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor>=0)
            this.valor = valor;
    }
    public long getTempoDias()
    {
        return ChronoUnit.DAYS.between(dtprod,LocalDate.now());
    }
}
