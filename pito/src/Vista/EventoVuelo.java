package Vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class EventoVuelo extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textAeroO;
	private JTextField textAeroD;
	private JTextField textFechaIda;
	private JTextField textCodVuelo;
	private JTextField textAerolinea;
	private JTextField textPrecio;
	private JTextField textHoraSalida;
	private JTextField textDuracion;

	/**
	 * Create the panel.
	 */
	public EventoVuelo(VentanasViajes v) {
		setBackground(Color.DARK_GRAY);
		
		
		setSize(900, 600);
		setVisible(true);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 900, 600);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblTrayecto = new JLabel("Trayecto");
		lblTrayecto.setBounds(10, 106, 75, 14);
		panel.add(lblTrayecto);
		
		JLabel lblAeropuertoO = new JLabel("Aeropuerto Origen");
		lblAeropuertoO.setBounds(10, 148, 113, 14);
		panel.add(lblAeropuertoO);
		
		JLabel lblAeropuertoD = new JLabel("Aeropuerto Destino");
		lblAeropuertoD.setBounds(10, 186, 113, 14);
		panel.add(lblAeropuertoD);
		
		JLabel lblFechaIda = new JLabel("Fecha Ida");
		lblFechaIda.setBounds(10, 234, 113, 14);
		panel.add(lblFechaIda);
		
		JLabel lblCodVuelo = new JLabel("Codigo Vuelo");
		lblCodVuelo.setBounds(10, 287, 113, 14);
		panel.add(lblCodVuelo);
		
		JLabel lblAerolinea = new JLabel("Aerolinea");
		lblAerolinea.setBounds(10, 341, 88, 14);
		panel.add(lblAerolinea);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 396, 46, 14);
		panel.add(lblPrecio);
		
		JLabel lblHoraSalida = new JLabel("Horario Salida");
		lblHoraSalida.setBounds(10, 445, 131, 14);
		panel.add(lblHoraSalida);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(10, 496, 113, 14);
		panel.add(lblDuracion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(2);
			}
		});
		btnGuardar.setBounds(180, 548, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(2);
			}
		});
		btnCancelar.setBounds(621, 548, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar Viaje");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(607, 144, 139, 23);
		panel.add(btnBuscar);
		
		JTextField textTrayecto = new JTextField();
		textTrayecto.setBounds(177, 103, 131, 20);
		panel.add(textTrayecto);
		textTrayecto.setColumns(10);
		
		textAeroO = new JTextField();
		textAeroO.setBounds(177, 145, 131, 20);
		panel.add(textAeroO);
		textAeroO.setColumns(10);
		
		textAeroD = new JTextField();
		textAeroD.setBounds(177, 183, 131, 20);
		panel.add(textAeroD);
		textAeroD.setColumns(10);
		
		textFechaIda = new JTextField();
		textFechaIda.setBounds(177, 231, 131, 20);
		panel.add(textFechaIda);
		textFechaIda.setColumns(10);
		
		textCodVuelo = new JTextField();
		textCodVuelo.setBounds(180, 284, 131, 20);
		panel.add(textCodVuelo);
		textCodVuelo.setColumns(10);
		
		textAerolinea = new JTextField();
		textAerolinea.setBounds(180, 338, 131, 20);
		panel.add(textAerolinea);
		textAerolinea.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(180, 393, 131, 20);
		panel.add(textPrecio);
		textPrecio.setColumns(10);
		
		textHoraSalida = new JTextField();
		textHoraSalida.setBounds(180, 442, 131, 20);
		panel.add(textHoraSalida);
		textHoraSalida.setColumns(10);
		
		textDuracion = new JTextField();
		textDuracion.setBounds(180, 493, 131, 20);
		panel.add(textDuracion);
		textDuracion.setColumns(10);
	}
}
