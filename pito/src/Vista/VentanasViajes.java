package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Vista.Inicio;
import Vista.NuevaAgencia;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class VentanasViajes extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanasViajes() {
		setBackground(Color.DARK_GRAY);
		getContentPane().setBackground(Color.DARK_GRAY);

		setResizable(false);
		setSize(1250, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Agencia de Viajes ");

	}

	public void cambiarPanel(int identificadorDePanel) {
		this.repaint();
		switch (identificadorDePanel) {
		case 0:
			setContentPane(new Inicio(this));
			break;
		case 1:
			setContentPane(new NuevaAgencia(this));
			break;
		case 2:
			setContentPane(new PanelPrincipal(this));
			break;
		case 3:
			setContentPane(new NuevoViaje(this));
			break;
		case 4:
			setContentPane(new NuevoEvento(this));
			break;
		case 5:
			setContentPane(new EventoActividad(this));
			break;
		case 6:
			setContentPane(new EventoVuelo(this));
			break;
		case 7:
			setContentPane(new EventoAlojamiento(this));
			break;
		}
	}

	public void lanzarVentana() {

		this.cambiarPanel(0);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		VentanasViajes v = new VentanasViajes();
		v.lanzarVentana();

	}
}
