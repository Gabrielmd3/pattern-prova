//Chain_of_responsibility
package questao_4;

public class VerificacaoHistorico extends VerificacaoAntifraude {
    @Override
    public void validar(Transacao t) {
        if (t.isClienteNovo()) {
             System.out.println("ALERTA: Cliente novo, requer verificação manual adicional.");
        }
        
        System.out.println("Histórico verificado.");
        
        if (proximaVerificacao != null) {
            proximaVerificacao.validar(t);
        } else {
            System.out.println("Transação APROVADA com sucesso!");
        }
    }
}
