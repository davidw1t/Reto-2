package Modelo;

public class Otros {
	
    private int idEvento;
    private String nombre;
    private String fecha;
    private String descripcion;
    private double precio;

    public Otros(int idEvento, String nombre, String fecha, String descripcion, double precio) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Otros{" +
                "idEvento=" + idEvento +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
