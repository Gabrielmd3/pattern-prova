//SINGLETON
package questao_5;

public class SistemaCorporativo {
    public static void main(String[] args) {
        Thread threadVendas = new Thread(() -> {
            Logger logVendas = Logger.getInstance();
            logVendas.logEvento("Venda realizada tome!: R$ 100,00");
        });

        Thread threadEstoque = new Thread(() -> {
            Logger logEstoque = Logger.getInstance();
            logEstoque.logErro("Falha ao atualizar estoque: Produto não encontrado, muito beta");
        });

        Thread threadAuditoria = new Thread(() -> {
            Logger logAuditoria = Logger.getInstance();
            logAuditoria.logEvento("Usuário Admin fez login");
        });

        threadVendas.start();
        threadEstoque.start();
        threadAuditoria.start();
    }
}
