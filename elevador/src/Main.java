//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5);

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        elevador.mostrarAndar();
    }
}