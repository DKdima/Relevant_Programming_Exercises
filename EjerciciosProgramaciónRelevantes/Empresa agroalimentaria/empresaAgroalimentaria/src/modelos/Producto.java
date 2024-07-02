package modelos;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Producto {
  private GregorianCalendar fechaCaducidad;
  private GregorianCalendar fechaEnvasado;
  private int numeroLote;
  private String paisOrigen;
  
  public Producto(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen) {
    this.fechaCaducidad = fechaCaducidad;
    this.fechaEnvasado = fechaEnvasado;
    this.numeroLote = numeroLote;
    this.paisOrigen = paisOrigen;
  }

  public GregorianCalendar getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  public int getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(int numeroLote) {
    this.numeroLote = numeroLote;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }

  public GregorianCalendar getFechaEnvasado() {
    return fechaEnvasado;
  }

  public void setFechaEnvasado(GregorianCalendar fechaEnvasado) {
    this.fechaEnvasado = fechaEnvasado;
  }

  @Override
  public String toString() {
    return ", fechaCaducidad=" + format(fechaCaducidad) + ", numeroLote=" + numeroLote + ", Pais Origen=" + paisOrigen + ", Fecha Envasado=" + format(fechaEnvasado);
  }

  public static String format(GregorianCalendar calendar) {
    SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
    fmt.setCalendar(calendar);
    String dateFormatted = fmt.format(calendar.getTime());

    return dateFormatted;
  }
}
