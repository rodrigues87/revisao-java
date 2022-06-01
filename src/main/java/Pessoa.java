import lombok.Data;

@Data
public class Pessoa {

    public Pessoa(String nome, int idade, Atribuicao atribuicao) {
        this.nome = nome;
        this.idade = idade;
        this.atribuicao = atribuicao;
        this.calcularSalario();
    }

    private String nome;
    private int idade;
    private boolean casado;
    private double salario;
    private Atribuicao atribuicao;

    public void calcularSalario() {
        this.salario = atribuicao.getSalarioBase() * idade;
    }
}
