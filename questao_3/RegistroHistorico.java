//Observer
package questao_3;

public class RegistroHistorico extends ModuloObserver {

    public RegistroHistorico(SensorDados sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    @Override
    public void update() {
        System.out.println("[Log] Gravando no banco de dados: " + java.time.LocalDateTime.now());
    }
}
