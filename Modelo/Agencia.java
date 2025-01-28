package Modelo;

public class Agencia {
	
    private int idAgencia;
    private String nombre;
    private String logo;
    private String colorMarca;
    private int numEmple;
    private String tipoAgencia;
	
    public Agencia(int idAgencia, String nombre, String logo, String colorMarca, int numEmple, String tipoAgencia) {
        this.idAgencia = idAgencia;
        this.nombre = nombre;
        this.logo = logo;
        this.colorMarca = colorMarca;
        this.numEmple = numEmple;
        this.tipoAgencia = tipoAgencia;
    }
    
    // Getters y setters
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColorMarca() {
        return colorMarca;
    }

    public void setColorMarca(String colorMarca) {
        this.colorMarca = colorMarca;
    }

    public int getNumEmple() {
        return numEmple;
    }

    public void setNumEmple(int numEmple) {
        this.numEmple = numEmple;
    }

    public String getTipoAgencia() {
        return tipoAgencia;
    }

    public void setTipoAgencia(String tipoAgencia) {
        this.tipoAgencia = tipoAgencia;
    }
    
    @Override
    public String toString() {
        return "Agencia{" +
                "idAgencia=" + idAgencia +
                ", nombre='" + nombre + '\'' +
                ", logo='" + logo + '\'' +
                ", colorMarca='" + colorMarca + '\'' +
                ", numEmple=" + numEmple +
                ", tipoAgencia='" + tipoAgencia + '\'' +
                '}';
    }
    
}
