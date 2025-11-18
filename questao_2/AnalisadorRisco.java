//Strategy
package questao_2;

public class AnalisadorRisco {
    private CalculoRiscoStrategy estrategia;

    public AnalisadorRisco(CalculoRiscoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculoRiscoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void executarAnalise(double patrimonio) {
        double riscoCalculado = estrategia.calcularRisco(patrimonio);
        System.out.println("Risco calculado: " + riscoCalculado);
    }
}
