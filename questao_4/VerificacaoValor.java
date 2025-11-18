//Chain_of_responsibility
package questao_4;

public class VerificacaoValor extends VerificacaoAntifraude {
    @Override
    public void validar(Transacao t) {
        if (t.getValor() > 5000) {
            System.out.println("FRAUDE DETECTADA: Valor muito alto (" + t.getValor() + "). Transação negada.");
        } else {
            System.out.println("Valor OK. Verificando próxima etapa...");
            if (proximaVerificacao != null) {
                proximaVerificacao.validar(t);
            } else {
                System.out.println("Transação APROVADA com sucesso!");
            }
        }
    }
}
