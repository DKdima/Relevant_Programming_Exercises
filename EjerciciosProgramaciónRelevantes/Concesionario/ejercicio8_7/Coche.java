package ejercicio8_7;

public class Coche {
	private String matricula,marca,modelo;
	private int km;
	private double precio;
	
	public  Coche(String matricula, String marca, String modelo, int km, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.precio = precio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
