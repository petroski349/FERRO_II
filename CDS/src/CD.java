import java.util.List;
public class CD {
   private String titulo;
    private String artista;
    private int ano;

    private List<Musica> musica;

    public CD(String titulo, String artista, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    void addMusica(Musica m){
        boolean x = false;
        for(Musica i: musica){
            if(i == m)
                x= true;
        }
        if(x==false)
            musica.add(m);
    }

    public List<Musica> getMusica() {
        return musica;
    }
}
