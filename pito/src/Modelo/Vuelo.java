package Modelo;

public class Vuelo {
	
    private int idEvento;
    private String tipoVuelo;
    private String aeroOrigenIda;
    private String aeroDestinoIda;
    private String codVueloIda;
    private String aerolineaIda;
    private double precio;
    private String fechaSalidaIda;
    private String horaSalidaIda;
    private String horaLlegadaIda;
    private int duracionIda;

    public Vuelo(int idEvento, String tipoVuelo, String aeroOrigenIda, String aeroDestinoIda, String codVueloIda,
                 String aerolineaIda, double precio, String fechaSalidaIda, String horaSalidaIda,
                 String horaLlegadaIda, int duracionIda) {
        this.idEvento = idEvento;
        this.tipoVuelo = tipoVuelo;
        this.aeroOrigenIda = aeroOrigenIda;
        this.aeroDestinoIda = aeroDestinoIda;
        this.codVueloIda = codVueloIda;
        this.aerolineaIda = aerolineaIda;
        this.precio = precio;
        this.fechaSalidaIda = fechaSalidaIda;
        this.horaSalidaIda = horaSalidaIda;
        this.horaLlegadaIda = horaLlegadaIda;
        this.duracionIda = duracionIda;
    }

    // Getters y setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getAeroOrigenIda() {
        return aeroOrigenIda;
    }

    public void setAeroOrigenIda(String aeroOrigenIda) {
        this.aeroOrigenIda = aeroOrigenIda;
    }

    public String getAeroDestinoIda() {
        return aeroDestinoIda;
    }

    public void setAeroDestinoIda(String aeroDestinoIda) {
        this.aeroDestinoIda = aeroDestinoIda;
    }

    public String getCodVueloIda() {
        return codVueloIda;
    }

    public void setCodVueloIda(String codVueloIda) {
        this.codVueloIda = codVueloIda;
    }

    public String getAerolineaIda() {
        return aerolineaIda;
    }

    public void setAerolineaIda(String aerolineaIda) {
        this.aerolineaIda = aerolineaIda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaSalidaIda() {
        return fechaSalidaIda;
    }

    public void setFechaSalidaIda(String fechaSalidaIda) {
        this.fechaSalidaIda = fechaSalidaIda;
    }

    public String getHoraSalidaIda() {
        return horaSalidaIda;
    }

    public void setHoraSalidaIda(String horaSalidaIda) {
        this.horaSalidaIda = horaSalidaIda;
    }

    public String getHoraLlegadaIda() {
        return horaLlegadaIda;
    }

    public void setHoraLlegadaIda(String horaLlegadaIda) {
        this.horaLlegadaIda = horaLlegadaIda;
    }

    public int getDuracionIda() {
        return duracionIda;
    }

    public void setDuracionIda(int duracionIda) {
        this.duracionIda = duracionIda;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idEvento=" + idEvento +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", aeroOrigenIda='" + aeroOrigenIda + '\'' +
                ", aeroDestinoIda='" + aeroDestinoIda + '\'' +
                ", codVueloIda='" + codVueloIda + '\'' +
                ", aerolineaIda='" + aerolineaIda + '\'' +
                ", precio=" + precio +
                ", fechaSalidaIda='" + fechaSalidaIda + '\'' +
                ", horaSalidaIda='" + horaSalidaIda + '\'' +
                ", horaLlegadaIda='" + horaLlegadaIda + '\'' +
                ", duracionIda=" + duracionIda +
                '}';
    }
}
