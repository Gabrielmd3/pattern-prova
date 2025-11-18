//Observer
package questao_3;

import java.util.ArrayList;
import java.util.List;

public class SensorDados {
    
    private List<ModuloObserver> observadores = new ArrayList<>();
    private double temperatura;
    private double indicePoluicao;

    public double getTemperatura() {
        return temperatura;
    }

    public double getIndicePoluicao() {
        return indicePoluicao;
    }

    public void setDados(double temperatura, double indicePoluicao) {
        this.temperatura = temperatura;
        this.indicePoluicao = indicePoluicao;
        notifyAllObservers();
    }

    public void attach(ModuloObserver observer) {
        observadores.add(observer);
    }

    public void notifyAllObservers() {
        for (ModuloObserver observer : observadores) {
            observer.update();
        }
    }
}
