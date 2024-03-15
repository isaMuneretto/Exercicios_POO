public class PessoaFisica extends Pessoa {
    //PessoaFisica é uma herança da classe Pessoa
    String cpf;

    @Override  //sobrescrito de método
    public void exibirDetalhes(){
        //super.exibirDetalhes();
        //System.out.println("CPF:"+this.cpf);

        System.out.println("Nome:"+this.nome);  // this chama cada atributo
        System.out.println("Sobrenome:"+this.sobrenome);
        System.out.println("Idade:"+this.idade);
        System.out.println("CPF:"+this.cpf);
    }
}


