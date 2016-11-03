package boletin5_7b;
public class Cuadrado {
    
    private float lado;
    
    public Cuadrado(){
        
        
    }
    
    public Cuadrado(float lado){
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

   @Override
    public String toString() {
        return "Cuadrado{" + "lado = " + lado + '}';
    }
    
    public void areaCuadrado(float lado){
        System.out.println("Area: " + (lado * lado));
        
    }
    
}
