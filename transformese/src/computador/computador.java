package computador;

public class computador {

private boolean ligado;
    
    public computador(boolean situacaoDoComputador) {
        this.ligado = situacaoDoComputador;
    }
    
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar() {
        setLigado(true);
    }
    
    public void desligar() {
        setLigado(false);
    }
    
    public void imprimir() {
        if (ligado) {
            System.out.println("Computador ligado!");
        } else {
            System.out.println("Computador desligado!");
        }
    }
}