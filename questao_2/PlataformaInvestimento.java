//Strategy
package questao_2;

public class PlataformaInvestimento {
    public static void main(String[] args) {
        double patrimonioCliente = 2000.00;

        AnalisadorRisco analisador = new AnalisadorRisco(new RiscoConservador());
        System.out.print("Perfil Conservador: ");
        analisador.executarAnalise(patrimonioCliente);

        analisador.setEstrategia(new RiscoModerado());
        System.out.print("Agora mudou para Moderado: ");
        analisador.executarAnalise(patrimonioCliente);

        analisador.setEstrategia(new RiscoAgressivo());
        System.out.print("alterou para Agressivo muito beta:");
        analisador.executarAnalise(patrimonioCliente);
    }
}
