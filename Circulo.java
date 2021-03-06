/*
 * @author Castilin
 */

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(){
        this(0.0);
    }

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea(){
        return Math.PI*raio*raio;
    }
    public double getPerimetro(){
        return 2*Math.PI*raio;
    }
    public double getDiametro(){
        return 2*raio;
    }

}