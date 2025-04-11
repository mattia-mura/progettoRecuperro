package classi;

public class Investimenti {

    private int durata;
    private double soldi;
    private double guadagno;


    public Investimenti(int durata,double soldi,double guadagno){
        this.durata=durata;
        this.soldi = soldi;
        this.guadagno=guadagno;
    }

    public void scalaTempo (){
        this.durata = this.durata-1;
    }

    public int getTempo(){
        return this.durata;
    }

    public double getSoldi() {
        return this.soldi;
    }

    public double getGuadagno(){
        return this.guadagno;
    }
}
