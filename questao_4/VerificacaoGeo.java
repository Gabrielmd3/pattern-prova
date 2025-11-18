//Chain_of_responsibility
package questao_4;

public class VerificacaoGeo extends VerificacaoAntifraude {
    @Override
    public void validar(Transacao t) {
        if (!t.getPais().equals("BR")) {
            System.out.println("FRAUDE DETECTADA: Geolocalização suspeita (" + t.getPais() + "). Transação negada.");
        } else {
            System.out.println("Geolocalização OK. Verificando próxima etapa...");
            if (proximaVerificacao != null) {
                proximaVerificacao.validar(t);
            } else {
                System.out.println("Transação APROVADA com sucesso!");
            }
        }
    }
}
