import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProcessoSeletivo {

    int quantidadeDeVagas;
    Set<Pessoa> candidatos;
    Set<Pessoa> canditatosAprovados;

    public ProcessoSeletivo(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
    }

    public void verificarCandidatosAprovados() {

        canditatosAprovados = new HashSet<>();

        for (Pessoa candidato : candidatos){
            if(verificarMaiorIdade(candidato)){
                if(candidato.getAtribuicao().getTipoDeAtribuicao().equals(TiposDeAtribuicao.JUNIOR)){
                    canditatosAprovados.add(candidato);
                }
            }
        }
    }

    private boolean verificarMaiorIdade(Pessoa candidato) {
        if(candidato.getIdade() >= 18){
            return true;
        }else {
            return false;
        }
    }
}
