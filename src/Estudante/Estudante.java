package Estudante;

import java.util.ArrayList;

public class Estudante {

    ArrayList<Double> notas = new ArrayList();
    String nome;

    public void adicionarNota(double nota){
        notas.add(nota);
    }

    public double calcularMedia(){
        int quantidadeNotas = notas.size(); //size é quantidade de notas que tem na lista
        double media = 0;
        double somaNotas = 0;
        for(int i = 0; i < quantidadeNotas; i++){
            somaNotas = somaNotas + notas.get(i);
        }
        media = somaNotas/quantidadeNotas;
        return media;
    }

}
