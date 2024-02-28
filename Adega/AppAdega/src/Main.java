import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vinho vinho=new Vinho("branco","Xapinha",500, LocalDate.of(2023,2,22),2.99);
        Vinho vinho2=new Vinho("tinto","Xapinha",500, LocalDate.of(2002,2,22),2.99);

        Adega adega = new Adega();
        adega.inserirVinho(vinho2);
        adega.inserirVinho(vinho);
        adega.inserirVinho(vinho,5,5);
        System.out.println("quantidade de vinhos: "+ adega.quantVinhos());
        System.out.println("vinhos brancos: "+ adega.quantPorTipo("branco"));
        System.out.println("Valor agregado: "+ adega.valorAgregado());
        System.out.println("Vinho mais antigo: "+ adega.vinhoMaisAntigo().getDtprod());
        adega.retirarVinho(5,5);
        System.out.println("Quantidade de vihos na adega:" + adega.quantVinhos());





    }
}
