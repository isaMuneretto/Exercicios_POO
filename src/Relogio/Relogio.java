package Relogio;

public class Relogio {
    int hora;
    int minuto;
    int segundo;


    public void adicionarHora(){
        hora++;
        if (hora == 24){
            hora = 0;
        }
    }
    public void adicionarMinuto(){
        minuto++;
        if (minuto == 60){
            this.adicionarHora();
            minuto = 0;
            segundo = 0;
        }
    }
    public void adicionarSegundo(){
        segundo++;
        if (segundo == 60){
            this.adicionarMinuto();
            segundo = 0;
        }
    }
    public void exibirHorario(){
        System.out.println("O horário atual é:"+hora+":"+minuto+":"+segundo);
    }
}
