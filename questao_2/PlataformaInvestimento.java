//Strategy
package questao_2;

public class PlataformaInvestimento {
    public static void main(String[] args) {
        double patrimonioCliente = 100000.00;

        AnalisadorRisco analisador = new AnalisadorRisco(new RiscoConservador());
        System.out.print("Cliente Perfil Conservador: ");
        analisador.executarAnalise(patrimonioCliente);

        analisador.setEstrategia(new RiscoModerado());
        System.out.print("Cliente mudou para Moderado: ");
        analisador.executarAnalise(patrimonioCliente);

        analisador.setEstrategia(new RiscoAgressivo());
        System.out.print("Consultor alterou para Agressivo: ");
        analisador.executarAnalise(patrimonioCliente);
    }
}
