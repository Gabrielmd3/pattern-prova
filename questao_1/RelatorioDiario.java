//Factory Method
public class RelatorioDiario implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Diário: você é beta 🫠🫠🫠.");
    }
}