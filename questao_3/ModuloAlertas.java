//Observer
package questao_3;

public class ModuloAlertas extends ModuloObserver {

    public ModuloAlertas(SensorDados sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    @Override
    public void update() {
        if (sensor.getTemperatura() > 40 || sensor.getIndicePoluicao() > 100) {
            System.out.println("[ALERTA] Condições críticas detectadas! Enviando SMS para equipe.");
        }
    }
}
