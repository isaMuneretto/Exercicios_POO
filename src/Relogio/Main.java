package Relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Relogio relogio = new Relogio();
        System.out.println("Digite a hora atual:");
        relogio.hora = leia.nextInt();
        System.out.println("Digite o minuto atual:");
        relogio.minuto = leia.nextInt();
        System.out.println("Digite o segundo atual:");
        relogio.segundo = leia.nextInt();
        relogio.adicionarHora();
        relogio.exibirHorario();
        relogio.adicionarMinuto();
        relogio.exibirHorario();
        relogio.adicionarSegundo();
        relogio.exibirHorario();
    }
}
