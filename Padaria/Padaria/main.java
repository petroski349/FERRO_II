import java.time.LocalDate;

public class main {
    public static void main(String args[]) {
        Caixa c = new Caixa();
        c.novaComanda("joao");

        c.novaComanda("Julio Gaiteiro");

        c.novaComanda("Jhowzin bobão");


        c.relComanda();


        System.out.println(c.getComanda(1).getCliente());

        c.pagarComanda(2);

        c.relComanda();

    }
}
