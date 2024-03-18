package Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); //sistema de entrada. Leia captura o que o usuario vai digitar
        Contador contador = new Contador();
        System.out.println("Digite um valor para contador:"); //pergunta para o usuario
        contador.valor = leia.nextInt(); //variavel do tipo int se usa nextInt
        contador.incrementar();
        contador.exibirValor();
        contador.decrementar();
        contador.exibirValor();
    }
}
