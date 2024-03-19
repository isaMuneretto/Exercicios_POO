package Estudante;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do estudante:");
        estudante.nome = leia.nextLine();

        estudante.calcularMedia();
    }
}
