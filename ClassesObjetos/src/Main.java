public class Main {
    public static void main(String[] args) {
        // new -> operador instancia
        // Retangulo() -> metodo construtor
        Retangulo retangulo = new Retangulo(); // <- builder

        retangulo.largura = 150;
        retangulo.altura = 200;

        retangulo.imprimir();

        Retangulo retangulo2 = new Retangulo();
        retangulo2.largura = 100;
        retangulo2.altura = 300;
        retangulo2.imprimir();
    }
}
