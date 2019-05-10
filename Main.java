import java.util.Scanner;

/*
 * @author Castilin
 */
public class Main {
    
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Circulo cir = new Circulo();
        Scanner ent = new Scanner(System.in);
        System.out.printf("Retangulo\nLargura: ");
        ret.setLargura(ent.nextFloat());
        System.out.printf("Altura: ");
        ret.setAltura(ent.nextFloat());
        System.out.printf("Area: %.3f\n", ret.getArea());
        System.out.printf("Circulo\nRaio: ");
        cir.setRaio(ent.nextFloat());
        System.out.printf("Area: %.3f\n", cir.getArea());
        ent.close();
    }
}