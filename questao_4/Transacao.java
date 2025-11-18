//Chain_of_responsibility
package questao_4;

class Transacao {
    private double valor;
    private String pais;
    private boolean clienteNovo;
    
    public Transacao(double v, String p, boolean n) { 
        this.valor = v; this.pais = p; this.clienteNovo = n; 
    }
    public double getValor() { return valor; }
    public String getPais() { return pais; }
    public boolean isClienteNovo() { return clienteNovo; }
}
