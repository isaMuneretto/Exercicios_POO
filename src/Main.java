
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //classe pessoa vai servir de molde
        System.out.println(pessoa1);
        pessoa1.nome = "Rhaisa";
        pessoa1.sobrenome = "Muneretto";
        pessoa1.idade = 31;
        pessoa1.exibirDetalhes();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2);
        pessoa2.nome = "Eduardo";
        pessoa2.sobrenome = "Lehmkuhl";
        pessoa2.idade = 43;
        pessoa2.exibirDetalhes();

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.nome = "Ervani";
        pessoaFisica1.sobrenome = "Muneretto";
        pessoaFisica1.idade = 66;
        pessoaFisica1.cpf = "081.664.589-26";
        pessoaFisica1.exibirDetalhes();

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.nome = "GPR";
        pessoaJuridica1.cnpj = "03.001.126/0001-26";
        pessoaJuridica1.exibirDetalhes();
    }


}