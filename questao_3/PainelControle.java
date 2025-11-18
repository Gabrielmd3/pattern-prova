//Observer
package questao_3;

public class PainelControle extends ModuloObserver {

    public PainelControle(SensorDados sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    @Override
    public void update() {
        System.out.println("[Painel] Atualizando display: Temp " + sensor.getTemperatura() + "°C | Poluição: " + sensor.getIndicePoluicao());
    }
}
