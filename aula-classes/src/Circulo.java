public class Circulo {
    double raio;

    public double area(){
        raio = Math.PI * Math.pow(raio, 2);
        return raio;
    }

    public void showArea(){
        System.out.println("Area: " + Double.toString(area()));
    }
}