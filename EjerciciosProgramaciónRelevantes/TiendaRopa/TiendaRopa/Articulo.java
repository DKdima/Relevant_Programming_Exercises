package TiendaRopa;

public abstract class Articulo {
	
	private Referencia referencia;
	private String descripcion;
	private int stock;
	private double precio;
	
	
	public Articulo(Referencia referencia, String descripcion, int stock, double precio) {
		this.referencia = referencia;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}

	
}
