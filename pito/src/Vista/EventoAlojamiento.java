package Vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class EventoAlojamiento extends JPanel{

		private static final long serialVersionUID = 1L;
		private JTextField textPrecio;
		private JTextField txtCiudad;

		/**
		 * Create the panel.
		 */
		public EventoAlojamiento(VentanasViajes v) {
			setBackground(Color.DARK_GRAY);
			
			
			setSize(900, 600);
			setVisible(true);
			setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.setBounds(0, 0, 900, 600);
			add(panel);
			panel.setLayout(null);
			
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 194, 76, 14);
			panel.add(lblPrecio);
			
			JLabel lblCiudad = new JLabel("Ciudad");
			lblCiudad.setBounds(10, 153, 46, 14);
			panel.add(lblCiudad);
			
			JLabel lblTipoHab = new JLabel("Tipo de habitación");
			lblTipoHab.setBounds(10, 113, 110, 14);
			panel.add(lblTipoHab);
			
			JLabel lblFechaEntrada = new JLabel("Fecha Entrada");
			lblFechaEntrada.setBounds(10, 260, 110, 14);
			panel.add(lblFechaEntrada);
			
			JLabel lblFechaSalida = new JLabel("Fecha Salida");
			lblFechaSalida.setBounds(290, 260, 86, 14);
			panel.add(lblFechaSalida);
			
			JButton btnBuscarAlojamiento = new JButton("Buscar Alojamiento");
			btnBuscarAlojamiento.setBounds(351, 126, 139, 23);
			panel.add(btnBuscarAlojamiento);
			
			textPrecio = new JTextField();
			textPrecio.setBounds(130, 191, 86, 20);
			panel.add(textPrecio);
			textPrecio.setColumns(10);
			
			txtCiudad = new JTextField();
			txtCiudad.setBounds(130, 150, 86, 20);
			panel.add(txtCiudad);
			txtCiudad.setColumns(10);
			
			JComboBox TipoHab = new JComboBox();
			TipoHab.setBounds(130, 109, 110, 22);
			panel.add(TipoHab);
			
			JComboBox Entrada = new JComboBox();
			Entrada.setBounds(130, 256, 110, 22);
			panel.add(Entrada);
			
			JComboBox Salida = new JComboBox();
			Salida.setBounds(404, 256, 104, 22);
			panel.add(Salida);
		}
}
