package modelos;

import java.util.GregorianCalendar;

public class P_Fresco extends Producto{
  
  public P_Fresco(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen);
  }

  @Override
  public String toString() {
    return ">-*-< P_Fresco" + super.toString();
  }
}
