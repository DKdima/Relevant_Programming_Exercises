package modelos;

import java.util.GregorianCalendar;

public class P_Congelado_Nitrogeno extends P_Congelado {
  private String metodo;
  private long tiempoExposicion;
  public P_Congelado_Nitrogeno(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento, String metodo, long tiempoExposicion) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimiento);
    this.metodo = metodo;
    this.tiempoExposicion = tiempoExposicion;
  }
  public String getMetodo() {
    return metodo;
  }
  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }
  public long getTiempoExposicion() {
    return tiempoExposicion;
  }
  public void setTiempoExposicion(long tiempoExposicion) {
    this.tiempoExposicion = tiempoExposicion;
  }
  @Override
  public String toString() {
    return ">-*-< P_Congelado_Nitrogeno: metodo=" + metodo + ", tiempoExposicion=" + tiempoExposicion + super.toString();
  }
}
