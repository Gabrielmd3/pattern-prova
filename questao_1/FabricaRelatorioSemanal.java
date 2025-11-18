//Factory Method
public class FabricaRelatorioSemanal implements iFabricaRelatorio {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
}