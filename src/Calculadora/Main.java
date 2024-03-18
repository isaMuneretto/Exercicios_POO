package Calculadora;

public class Main {
    public static void main(String[] args) {
        //Criação do objeto calculadora
        Calculadora calculadora = new Calculadora();
        double resultado = 0;
        //chama os métodos
        resultado = calculadora.somar(10,2);
        System.out.println("A soma é:"+resultado);
        resultado = calculadora.subtrair(10,2);
        System.out.println("A subtração é:"+resultado);
        resultado = calculadora.multiplicar(10,2);
        System.out.println("A multiplicação é:"+resultado);
        resultado = calculadora.dividir(10,2);
        System.out.println("A divisão é:"+resultado);
    }
}
