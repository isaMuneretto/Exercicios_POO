public class PessoaJuridica extends Pessoa {
    String cnpj;

    @Override  //sobrescrito de método
    public void exibirDetalhes(){
        //super.exibirDetalhes();
        //System.out.println("CNPJ:"+this.cnpj);

        System.out.println("Nome:"+this.nome);  // this chama cada atributo
        System.out.println("CNPJ:"+this.cnpj);
    }

}
