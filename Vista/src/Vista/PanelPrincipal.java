package Vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class PanelPrincipal extends JPanel{

	
	private static final long serialVersionUID = 1L;

	public PanelPrincipal(VentanasViajes v) {
		setBackground(Color.DARK_GRAY);
		
		
		setSize(1250, 720);
		setVisible(true);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(201, 36, 900, 600);
		add(panel);
		panel.setLayout(null);
		
		JButton btnnuevoViaje = new JButton("Nuevo Viaje");
		btnnuevoViaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(3);
			}
		});
		btnnuevoViaje.setBounds(699, 63, 148, 23);
		panel.add(btnnuevoViaje);
		
		JButton btnnuevoEvento = new JButton("Nuevo Evento");
		btnnuevoEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(4);
			}
		});
		btnnuevoEvento.setBounds(699, 419, 148, 23);
		panel.add(btnnuevoEvento);
		
		JButton btnGenerar = new JButton("Generar Nueva Oferta");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerar.setBounds(53, 498, 149, 23);
		panel.add(btnGenerar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(686, 498, 89, 23);
		panel.add(btnCancelar);
		
		
		
	}
}
