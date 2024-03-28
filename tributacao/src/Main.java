public class Main {

    public static void main(String[] args) {

        GrupoDeContribuintes G = new GrupoDeContribuintes();

        Contribuinte Joao = new PessoaFisica("João BoBão", "Masculino", 123456789, 15000);
        Contribuinte Julio = new PessoaJuridica("Julio Gaiteiro","Masculino",987654321,15000);
        Contribuinte Raul = new PessoaJuridica("Raul Lindo","Masculino",5697864,50000);
        Contribuinte Jessica = new PessoaJuridica("Jessica", "Feminino",157232567,50000);



        G.addContribuinte(Joao);
        G.addContribuinte(Julio);
        G.addContribuinte(Raul);
        G.addContribuinte(Jessica);
        System.out.println("Imposto de Pessoa Física: " + Joao.calcImposto());
        System.out.println("Imposto total devido: " + G.impostoDevidoColecao());
        System.out.println("Imposto de Pessoa Jurídica: " + Julio.calcImposto());
        System.out.println("porcentagem de mulheres contribuintes: " + G.sexoFeminino()+"%");

    }
}