import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vinho vinho=new Vinho("blue","Xapinha",500, LocalDate.of(2023,2,22),2.99);
        Adega adega = new Adega();
        System.out.println(vinho.getTempoDias());
        adega.inserirVinho(vinho);
        adega.inserirVinho(vinho,5,5);
        System.out.println("quantidade de vinhos: "+ adega.quantVinhos());
        System.out.println(adega.quantPorTipo("blue"));




    }
}
