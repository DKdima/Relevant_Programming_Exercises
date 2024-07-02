package modelos;

import java.util.GregorianCalendar;

public abstract class P_Congelado extends Producto_Temperatura {

  public P_Congelado(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimiento);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
