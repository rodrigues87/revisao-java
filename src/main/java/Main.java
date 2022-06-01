import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Atribuicao junior = new Atribuicao(TiposDeAtribuicao.JUNIOR);
        Atribuicao pleno = new Atribuicao(TiposDeAtribuicao.PLENO);

        Pessoa paulo = new Pessoa("Paulo",14,junior);
        Pessoa fernando = new Pessoa("Fernando",44,junior);
        Pessoa murilo = new Pessoa("Murilo",18,pleno);
        Pessoa carlos = new Pessoa("Carlos",20,pleno);

        Set<Pessoa> candidatos = new HashSet<>();
        candidatos.add(paulo);
        candidatos.add(fernando);
        candidatos.add(murilo);
        candidatos.add(carlos);

        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(2);
        processoSeletivo.setCandidatos(candidatos);
        processoSeletivo.verificarCandidatosAprovados();
        System.out.println();
    }
}
