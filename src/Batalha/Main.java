package Batalha;

public class Main {
    public static void main (String[] args){
        Heroi heroi1 = new Heroi();
        Heroi heroi2 = new Heroi();
        heroi1.nome = "Thor";
        heroi1.forca = 50;
        heroi2.nome = "Hulk";
        heroi2.forca = 40;
        heroi1.atacar(heroi2); //heroi1 ataca o heroi2
        heroi2.atacar(heroi1); //heroi2 ataca o heroi1
    }
}
