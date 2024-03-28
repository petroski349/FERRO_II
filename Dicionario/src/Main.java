import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dicionario D = new Dicionario();
        TermoSimples ts = new TermoSimples("cachorro","dog","dogui");

        ArrayList<String> al = new ArrayList<>();
        al.add("Belo");
        al.add("Lindo");
        al.add("Formoso");
        TermoCompleto tc = new TermoCompleto("Bonito","beautiful",al);

        D.inserir(ts);
        D.inserir(tc);
        System.out.println("Tradução: "+D.traduzir("cachorro"));
        D.remover("cachorro");
        System.out.println("Tradução: "+D.traduzir("cachorro"));
        System.out.println(tc.getSinonimo());

    }
}