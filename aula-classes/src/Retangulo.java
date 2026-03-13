public class Retangulo {
    // <tipo de dados> <nome do atributo>
    double largura;
    double altura;

    //public Retangulo(double largura, double altura){}

    public double area(){
        return largura * altura;
    }

    public void imprimir(){
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area());
    }
}
