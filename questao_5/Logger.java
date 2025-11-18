//SINGLETON
package questao_5;

public class Logger {
    private static volatile Logger instancia;

    private Logger() {
        System.out.println("Iniciando Sistema de Log (Instância Única criada)...");
    }

    public static Logger getInstance() {
        if (instancia == null) {
            synchronized (Logger.class) {
                if (instancia == null) {
                    instancia = new Logger();
                }
            }
        }
        return instancia;
    }

    public void logEvento(String mensagem) {
        System.out.println("[EVENTO] " + mensagem);
    }

    public void logErro(String erro) {
        System.err.println("[ERRO] " + erro);
    }
}
