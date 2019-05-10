import java.util.Date;

/*
 * @author Castilin
 */

public class FiguraGeometrica{
    protected String color;
    protected boolean preenche;
    protected Date dataCriacao;

    public FiguraGeometrica(){

    }

    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public boolean estaPreenche(){
        return preenche;
    }
    
    public void setPreenche(boolean preenche) {
        this.preenche = preenche;
    }
    
    public Date getData() {
        return dataCriacao;
    }
    @Override
    public String toString() {
        return super.toString();
    }

}