package Figuras_abstracta;

public class Circulo extends FiguraGeometrica {
	
	private double radio;

	public Circulo(int x, int y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	public Circulo() {}
	
	public  double area() {
		return 3.1416 * Math.pow(radio,2);
	}
	public  double perimetro() {
		return 2 * 3.1416 * radio;
	}
	public void mostrar() {
		System.out.println("La figura Circulo está en la posición: ("+super.x+","+super.y+")");
		System.out.println("El radio es: "+radio);
		System.out.println("El área es: "+area());
		System.out.println("El perímetro es: "+perimetro());
	}
}
