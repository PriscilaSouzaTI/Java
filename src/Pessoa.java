public class Pessoa {
    private String cpf;
    private String rg;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String rg, String nome, int idade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " + idade);
    }
}
