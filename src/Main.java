public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("123456789", "987654321", "Priscila", 18, "A123");
        aluno.exibirInformacoes();
        System.out.println();

        Professor professor = new Professor("987654321", "123456789", "Wagner", 35, "Matemática");
        professor.exibirInformacoes();
        System.out.println();

        Diretor diretor = new Diretor("456789123", "654321987", "Edney", 40, "Administração");
        diretor.exibirInformacoes();
        System.out.println();

        Responsavel responsavel = new Responsavel("789123456", "321987654", "Deus", 45, "Pai");
        responsavel.exibirInformacoes();
    }
}
