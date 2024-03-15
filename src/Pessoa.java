public class Pessoa {
    //Atributos int double
    String nome;
    String sobrenome;
    int idade;

    //Métodos que são as funções
    public void correr() { //void é sem retorno
        System.out.println("Está correndo!");
    }
    //pessoa1.exibirDetalhes(); ao inves de imprimir com "sout" é só colocar essa função no Main
    public void exibirDetalhes(){
        System.out.println("Nome:"+this.nome);  // this chama cada atributo
        System.out.println("Sobrenome:"+this.sobrenome);
        System.out.println("Idade:"+this.idade);
    }
}
