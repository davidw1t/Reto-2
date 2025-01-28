package Modelo;

public class Viaje {

    private int idViaje;
    private int idAgencia;
    private String nombre;
    private String descViaje;
    private String tipoViaje;
    private String fechaInicio;
    private String fechaFin;
    private int duracion;
    private String paisDestino;
    private String servicio;
    private String serviNoIncluidos;
    
	public Viaje(int idViaje, int idAgencia, String nombre, String descViaje, String tipoViaje, String fechaInicio, String fechaFin, int duracion, String paisDestino, String servicio, String serviNoIncluidos) {
		this.idViaje = idViaje;
		this.idAgencia = idAgencia;
		this.nombre = nombre;
		this.descViaje = descViaje;
		this.tipoViaje = tipoViaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.duracion = duracion;
		this.paisDestino = paisDestino;
		this.servicio = servicio;
		this.serviNoIncluidos = serviNoIncluidos;
	}
    
    // Getters y setters
    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescViaje() {
        return descViaje;
    }

    public void setDescViaje(String descViaje) {
        this.descViaje = descViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getServiNoIncluidos() {
        return serviNoIncluidos;
    }

    public void setServiNoIncluidos(String serviNoIncluidos) {
        this.serviNoIncluidos = serviNoIncluidos;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "idViaje=" + idViaje +
                ", idAgencia=" + idAgencia +
                ", nombre='" + nombre + '\'' +
                ", descViaje='" + descViaje + '\'' +
                ", tipoViaje='" + tipoViaje + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", duracion=" + duracion +
                ", paisDestino='" + paisDestino + '\'' +
                ", servicio='" + servicio + '\'' +
                ", serviNoIncluidos='" + serviNoIncluidos + '\'' +
                '}';
    }
	
}
