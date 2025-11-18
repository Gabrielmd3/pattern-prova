public class SistemaLogistica {
    public static void main(String[] args) {
        // O sistema precisa de um relatório diário
        // Instancia a fábrica específica (poderia vir de uma configuração)
        iFabricaRelatorio fabricaDiario = new FabricaRelatorioDiario();
        iRelatorio relatorio1 = fabricaDiario.criarRelatorio();
        relatorio1.gerar();

        // O sistema precisa de um relatório semanal
        iFabricaRelatorio fabricaSemanal = new FabricaRelatorioSemanal();
        iRelatorio relatorio2 = fabricaSemanal.criarRelatorio();
        relatorio2.gerar();
        
        // Se no futuro precisarmos de um "RelatorioEmergencial", 
        // basta criar a classe do relatório e sua fábrica correspondente,
        // sem alterar este código que consome a interface iFabricaRelatorio.
    }
}