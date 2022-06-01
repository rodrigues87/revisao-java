import lombok.Data;

@Data
public class Atribuicao {
    private TiposDeAtribuicao tipoDeAtribuicao;
    private double salarioBase;

    public Atribuicao(TiposDeAtribuicao tipoDeAtribuicao) {
        this.tipoDeAtribuicao = tipoDeAtribuicao;
        this.calcularSalarioBase();
    }

    public void calcularSalarioBase(){
        if(tipoDeAtribuicao == TiposDeAtribuicao.JUNIOR){
            this.salarioBase = 25.00;
        }
        if(tipoDeAtribuicao == TiposDeAtribuicao.PLENO){
            this.salarioBase = 45.00;
        }
        if(tipoDeAtribuicao == TiposDeAtribuicao.SENIOR){
            this.salarioBase = 60.00;
        }
    }
}
