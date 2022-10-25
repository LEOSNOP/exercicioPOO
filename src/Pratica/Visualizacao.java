package Pratica;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void Avaliar(){
        this.filme.setAvaliação(5);
    }

    public void Avaliar(int n){
        this.filme.setAvaliação(n);
    }

    public void Avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }else if(porc <=50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliação(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "\nespectador=" + espectador +
                ", \nfilme=" + filme +
                '}';
    }
}
