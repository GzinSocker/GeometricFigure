/*
 * @author Castilin
 */

public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(){
        this(0,0);
    }
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getArea(){
        return largura*altura;
    }
    

}