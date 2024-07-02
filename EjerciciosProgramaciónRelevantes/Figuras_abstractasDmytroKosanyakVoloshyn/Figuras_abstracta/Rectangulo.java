package Figuras_abstracta;

public class Rectangulo extends FiguraGeometrica {
	
	protected double lado1,lado2;
	
	public Rectangulo(int x, int y, double lado1, double lado2) {
		super(x,y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public Rectangulo() {}
	
	public  double area() {
		
		return lado1*lado2;
	}
	public  double perimetro() {
		return lado1*2+lado2*2;
	}
	public void mostrar() {
		System.out.println("La figura Rectángulo está en la posición: ("+super.x+","+super.y+")");
		System.out.println("La altura es: "+lado1);
		System.out.println("La anchura es: "+lado2);
		System.out.println("El área es: "+area());
		System.out.println("El perímetro es: "+perimetro());
	}
}
