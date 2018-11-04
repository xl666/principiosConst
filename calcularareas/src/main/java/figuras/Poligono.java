package figuras;

public abstract class Poligono {

    protected int numeroLados;
    protected double[] longitudLados;

    protected Poligono(int numeroLados, double[] longitudLados) {
	this.numeroLados = numeroLados;
	this.longitudLados = longitudLados;
    }

    protected Poligono() {
    }
    
    public abstract double calcularArea();
    public double calcularPerimetro() {
	double resultado = 0;
	for(double longitud : longitudLados) {
	    resultado += longitud;
	}
	return resultado;
    }
}
