//Observer
package questao_3;

public class SistemaMonitoramento {
    public static void main(String[] args) {
        SensorDados sensorRegiaoNorte = new SensorDados();

        new PainelControle(sensorRegiaoNorte);
        new ModuloAlertas(sensorRegiaoNorte);
        new RegistroHistorico(sensorRegiaoNorte);
        System.out.println("--- Atualização 1: Dados Normais ---");
        sensorRegiaoNorte.setDados(10.0, 10.0);

        System.out.println("\n--- Atualização 2: Alta Poluição ---");
        sensorRegiaoNorte.setDados(45.0, 100.0);
    }
}
