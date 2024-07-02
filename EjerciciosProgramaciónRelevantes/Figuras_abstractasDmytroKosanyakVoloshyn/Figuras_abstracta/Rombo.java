package Figuras_abstracta;

public class Rombo extends FiguraGeometrica  {

	private double diagonal1,diagonal2;
	
	public Rombo(int x, int y, double diagonal1, double diagonal2) {
		super(x, y);
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	public Rombo () {}
	
	public  double area() {
		return (diagonal1*diagonal2)/2;
	}	
	public  double perimetro() {
		return 2*Math.sqrt(Math.pow(diagonal1,2)+Math.pow(diagonal2,2));
	}
	public void mostrar() {
		System.out.println("La figura Rombo está en la posición: ("+super.x+","+super.y+")");
		System.out.println("La altura es: "+diagonal1);
		System.out.println("La anchura es: "+diagonal2);
		System.out.println("El área es: "+area());
		System.out.println("El perímetro es: "+perimetro());
	}
}
