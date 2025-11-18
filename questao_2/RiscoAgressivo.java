//Strategy
package questao_2;

public class RiscoAgressivo implements CalculoRiscoStrategy {
    @Override
    public double calcularRisco(double patrimonio) {
        return patrimonio * 0.30;
    }
}
