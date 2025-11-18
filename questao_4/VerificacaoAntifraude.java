//Chain_of_responsibility
package questao_4;

public abstract class VerificacaoAntifraude {
    protected VerificacaoAntifraude proximaVerificacao;

    public void setProximaVerificacao(VerificacaoAntifraude proxima) {
        this.proximaVerificacao = proxima;
    }

    public abstract void validar(Transacao transacao);
}
