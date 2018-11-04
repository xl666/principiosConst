package figuras;

public class Cuadrado extends Poligono {

    public Cuadrado(double longitudLado) {
	super();
	this.numeroLados = 4;
	this.longitudLados = new double[4];
	this.longitudLados[0] = longitudLado;
	this.longitudLados[1] = longitudLado;	
	this.longitudLados[2] = longitudLado;
	this.longitudLados[3] = longitudLado
    }

    @Override
    public double calcularArea() {
	return this.longitudLados[0] * this.longitudLados[0];
    }
}
