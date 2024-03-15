public class Main {
    public static void main(String[] args) {

    Acervo A = new Acervo();

    Musica m = new Musica("bololo",7);
    CD cd = new CD("pokas","Neguin da Cacheta",2010);

    cd.addMusica(m);
    A.addCD(cd);
    }
}