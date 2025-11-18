//Chain_of_responsibility
package questao_4;

public class SistemaPagamentos {
    public static void main(String[] args) {
        VerificacaoAntifraude v1_Valor = new VerificacaoValor();
        VerificacaoAntifraude v2_Geo = new VerificacaoGeo();
        VerificacaoAntifraude v3_Hist = new VerificacaoHistorico();

        v1_Valor.setProximaVerificacao(v2_Geo);
        v2_Geo.setProximaVerificacao(v3_Hist);

        System.out.println("--- Testando Transação 1 ---");
        Transacao t1 = new Transacao(200.0, "BR", false);
        v1_Valor.validar(t1);

        System.out.println("\n--- Testando Transação 2 ---");
        Transacao t2 = new Transacao(200.0, "RU", false);
        v1_Valor.validar(t2);
    }
}
