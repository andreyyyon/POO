public class Elevador {
    int andarAtual;
    int totalAndares;
    boolean portaAberta;

    public Elevador(int totalAndares) {
        setAndarAtual(0);
        setTotalAndares(totalAndares);
        setPortaAberta(false);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual < 0) return;
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares < 0) return;
        this.totalAndares = totalAndares;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    public void subir(){
        if(isUltimoAndar()) return;

        if(!isPortaAberta()) abrirPorta();

        fecharPorta();

        setAndarAtual(getAndarAtual() + 1);
        System.out.println("Elevador subiu para o andar " + getAndarAtual());

        abrirPorta();
    }

    public void descer(){
        if(isTerreo()) return;

        if(!isPortaAberta()) abrirPorta();

        fecharPorta();

        setAndarAtual(getAndarAtual() - 1);
        System.out.println("Elevador desceu para o andar " + getAndarAtual());

        abrirPorta();
    }

    public void fecharPorta(){
        setPortaAberta(false);
        System.out.println("Elevador fechou a porta.");
    }

    public void abrirPorta(){
        setPortaAberta(true);
        System.out.println("Elevador abriu o porta.");
    }

    public boolean isUltimoAndar(){
        return getAndarAtual() == getTotalAndares();
    }

    public boolean isTerreo(){
        return getAndarAtual() == 0;
    }

    public void mostrarAndar(){
        System.out.println("Elevador está no andar " + getAndarAtual());
    }
}
