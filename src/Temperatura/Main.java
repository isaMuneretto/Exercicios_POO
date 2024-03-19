package Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius:");
        double celsius = leia.nextDouble();
        double fahrenheit = Temperatura.celsiusParaFahrenheit(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        System.out.println("Digite a temperatura em graus fahrenheit:");
        double fahrenheitConversao = leia.nextDouble();
        double celsiusConversao = Temperatura.fahrenheitParaCelsius(fahrenheitConversao);
        System.out.println("Temperatura em Celsius: " + celsiusConversao);
    }
}
