public class FabricaRelatorioDiario implements iFabricaRelatorio {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}