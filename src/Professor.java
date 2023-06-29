public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String cpf, String rg, String nome, int idade, String disciplina) {
        super(cpf, rg, nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
    }
}
