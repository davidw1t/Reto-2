package Modelo;

public class Alojamiento {
	
    private int idEvento;
    private String nombreHotel;
    private String ciudad;
    private double precio;
    private String fechaEntrada;
    private String fechaSalida;
    private String tipoHabitacion;

    public Alojamiento(int idEvento, String nombreHotel, String ciudad, double precio, String fechaEntrada,
                       String fechaSalida, String tipoHabitacion) {
        this.idEvento = idEvento;
        this.nombreHotel = nombreHotel;
        this.ciudad = ciudad;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoHabitacion = tipoHabitacion;
    }

    // Getters y setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "Alojamiento{" +
                "idEvento=" + idEvento +
                ", nombreHotel='" + nombreHotel + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                '}';
    }
}

