public class Circulo implements FiguraGeometrica {

    private int raio;
 
    public Circulo(int raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
