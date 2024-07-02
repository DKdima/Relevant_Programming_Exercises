package TiendaRopa;

public abstract class PrendaRopa extends Articulo{

	private String talla;
	private String tipo;

	public PrendaRopa(Referencia referencia, String descripcion, int stock, double precio, String tipo, String talla) {
		super(referencia, descripcion, stock, precio);
		this.talla = talla;
		this.tipo = tipo;
	}
	
}
