package Modelo;

public class Evento {
    
	private int idEvento;
    private int idViaje;
    private String tipoEvento;

    public Evento(int idEvento, int idViaje, String tipoEvento) {
        this.idEvento = idEvento;
        this.idViaje = idViaje;
        this.tipoEvento = tipoEvento;
    }

    // Getters y setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", idViaje=" + idViaje +
                ", tipoEvento='" + tipoEvento + '\'' +
                '}';
    }
}

