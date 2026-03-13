public class Main {
    public static void main(String[] args) {
        // new -> operador instancia
        // Retangulo() -> metodo construtor
        Retangulo retangulo = new Retangulo(); // <- builder

        retangulo.largura = 15;
        retangulo.altura = 20;

        retangulo.imprimir();

        Retangulo retangulo2 = new Retangulo();
        retangulo2.largura = 11;
        retangulo2.altura = 30;
        retangulo2.imprimir();

        // -- // --

        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.status();
        lampada.desligar();
        lampada.status();

        // -- // --

        Circulo circulo = new Circulo();
        circulo.raio = 20;
        circulo.showArea();
    }
}
