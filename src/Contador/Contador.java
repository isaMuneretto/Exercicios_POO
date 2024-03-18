package Contador;

public class Contador {
    int valor;
    //não tem retorno
    public void incrementar(){
        valor++; //valor = valor + 1;
    }
    public void decrementar(){
        valor--; //valor = valor - 1;
    }
    public void exibirValor(){
        System.out.println("Valor atual é:"+valor);
    }
}
