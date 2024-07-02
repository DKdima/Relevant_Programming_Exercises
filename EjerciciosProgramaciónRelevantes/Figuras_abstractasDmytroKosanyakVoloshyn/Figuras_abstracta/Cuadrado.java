package Figuras_abstracta;

public class Cuadrado extends Rectangulo{

	public Cuadrado(int x, int y, double lado1) {
		super(x,y, lado1, lado1);
	}
	public Cuadrado() {}
	
	public  double area() {	
		return super.area();
	}
	public  double perimetro() {
		return super.perimetro();
	}
	public void mostrar() {
		System.out.println("La figura Cuadrado está en la posición: ("+super.x+","+super.y+")");
		System.out.println("El lado es: "+lado1);
		System.out.println("El área es: "+area());
		System.out.println("El perímetro es: "+perimetro());
	}
}
