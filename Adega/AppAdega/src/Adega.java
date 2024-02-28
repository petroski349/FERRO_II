import java.time.LocalDate;

public class Adega {
    private Vinho[][] vinhos;

    public Adega() {
        vinhos=new Vinho[20][10];
        int i,j;
        for(i=0;i<20;i++)
            for(j=0;j<10;j++)
                vinhos[i][j] = null;
    }
    private boolean posicaoValida(int fileira, int coluna)
    {
        return fileira>=0 && fileira <vinhos.length
                && coluna >=0 && coluna<=vinhos[0].length
                && vinhos[fileira][coluna]==null;
    }
    public boolean inserirVinho(Vinho vinho, int fileira, int coluna)
    {
        if(posicaoValida(fileira,coluna))
        {
            vinhos[fileira][coluna] = vinho;
            return true;
        }
        return false;
    }
    public boolean inserirVinho(Vinho vinho)
    {
        int l =0, c=0;
        for(; l<20 && !posicaoValida(l,c);c++){
            if(c>10){
                l++;
                c=0;
            }
        }
        if(l<20){
            this.vinhos[l][c] = vinho;
            return true;
        }
        return false;
    }

    void quantPorTipo(){
        Vinho[][] aux = new Vinho[20][10];
        aux = vinhos;
        int i,j,l,c,cont;
        for(i=0,j=0;i<20;i++){
            for(j=0;j<10;j++){
                cont =1;


                if(aux[i][j] != null){
                    System.out.print(vinhos[i][j].getTipo()+" ");

                    for (c = 0, l = 0; l < 20; l++) {
                        for (c = 0; c < 10; c++) {
                            if (aux[i][j].getTipo() == aux[l][c].getTipo()) {
                                cont++;
                                aux[l][c] = null;
                            }
                        }
                    }
                    System.out.println(cont);
                    aux[i][j] = null;
                }


            }
        }
    }

    int quantPorTipo(String tipo){
        int i,j,cont=0;
        for(i=0;i<20;i++)
            for(j=0;j<10;j++)
                if(!posicaoValida(i,j))
                    if(vinhos[i][j].getTipo() == tipo)
                        cont++;
        return cont;
    }
    int quantVinhos(){
        int cont = 0;
        for(int i=0,j;i<20;i++){
            for(j=0;j<10;j++){
                if(!posicaoValida(i,j))
                    cont++;
            }
        }
        return cont;
    }

    double valorAgregado(){
        double soma=0;
        for(int i=0,j;i<20;i++){
            for(j=0;j<10;j++){
                if(!posicaoValida(i,j))
                    soma += vinhos[i][j].getValor();
            }
        }
        return soma;
    }

    Vinho vinhoMaisAntigo(){
        Vinho maisAnt = new Vinho();
        maisAnt.setDtprod(LocalDate.of(2030,2,22));
        for(int i=0,j;i<20;i++){
            for(j=0;j<10;j++){
                if(!posicaoValida(i,j))
                    if(vinhos[i][j].getDtprod().compareTo(maisAnt.getDtprod())<0)
                        maisAnt = vinhos[i][j];
            }
        }
        return maisAnt;
    }

    Vinho retirarVinho(int fileira,int coluna){
        Vinho aux = vinhos[fileira][coluna];
        vinhos[fileira][coluna] = null;
        return aux;
    }



}




