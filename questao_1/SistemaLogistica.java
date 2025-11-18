//Factory Method

public class SistemaLogistica {
    public static void main(String[] args) {
        iFabricaRelatorio fabricaDiario = new FabricaRelatorioDiario();
        iRelatorio relatorio1 = fabricaDiario.criarRelatorio();
        relatorio1.gerar();

        iFabricaRelatorio fabricaSemanal = new FabricaRelatorioSemanal();
        iRelatorio relatorio2 = fabricaSemanal.criarRelatorio();
        relatorio2.gerar();
    }
}