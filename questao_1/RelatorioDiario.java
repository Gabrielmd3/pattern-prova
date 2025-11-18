//Factory Method
public class RelatorioDiario implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Diário: Coletando dados das últimas 24h e priorizando métricas de turno.");
    }
}