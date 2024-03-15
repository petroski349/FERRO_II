import java.util.ArrayList;
import java.util.List;

public class Acervo {

    private List<CD> cd;

    public Acervo() {
        this.cd = new ArrayList<>();
    }

    void addCD(CD cd){
        boolean x = false;
        for(CD i: this.cd)
            if(i == cd)
                x=true;
        if(x=false)
            this.cd.add(cd);
    }

    public List<CD> getCd() {
        return cd;
    }
}
