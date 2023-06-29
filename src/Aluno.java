public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String cpf, String rg, String nome, int idade, String matricula) {
        super(cpf, rg, nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
    }
}
