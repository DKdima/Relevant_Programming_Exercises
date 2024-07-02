package Figuras_abstracta;

public abstract class FiguraGeometrica {
	
	protected int x,y;
	
	public FiguraGeometrica(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public FiguraGeometrica () {}
	
	//Métodos
	
	abstract public  double area();
	abstract public  double perimetro();
	abstract public void mostrar();

}
