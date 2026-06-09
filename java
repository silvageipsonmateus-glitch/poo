/**
 * Classe que representa um Aluno no sistema.
 * Contém os atributos sugeridos e as regras de negócio de média.
 */
public class Aluno {
    // Atributos privados (Encapsulamento)
    private String nome;
    private String matricula;
    private String curso;
    private double nota1;
    private double nota2;
    private double media;

    // Construtor para inicializar o objeto Aluno
    public Aluno(String nome, String matricula, String curso, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.calcularMedia(); // A média é calculada automaticamente na criação
    }

    // Regra: A média deve ser calculada automaticamente
    private void calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2.0;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
        calcularMedia(); // Recalcula se a nota mudar
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
        calcularMedia(); // Recalcula se a nota mudar
    }

    public double getMedia() {
        return media;
    }

    // Método auxiliar para verificar a situação do aluno
    public String getSituacao() {
        // Regras: Aprovado >= 7, Reprovado < 7
        if (this.media >= 7.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    // Método para exibir os dados do aluno de forma organizada
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula + " | Nome: " + nome + " | Curso: " + curso);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2 + " | Média: " + media + " -> Situação: " + getSituacao());
        System.out.println("---------------------------------------------------------");
    }
}
