package Pratica;

public class exec {

    public static void main(String[] args) {
        // criando as pessoas

        Gafanhoto f1 = new Gafanhoto("leo",18,"m");

        //criando os videos

        Video v1 = new Video("Git");

        // Criando Visualização
        Visualizacao vis = new Visualizacao(f1, v1);

        vis.Avaliar();

        System.out.println(vis.toString());




    }

}
