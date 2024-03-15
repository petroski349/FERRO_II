public class Tipo {
    private int id;

    private String nome;

    Tipo(int id,String nome){
        this.id = id;
        this.nome = nome;
    }
    int getId(){
        return  id;
    }

    String getNome(){
        return nome;
    }
}
