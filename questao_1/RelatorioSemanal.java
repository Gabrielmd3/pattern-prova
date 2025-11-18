//Factory Method
public class RelatorioSemanal implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Semanal: Consolidando KPIs da semana e formatando para apresentação executiva.");
    }
}