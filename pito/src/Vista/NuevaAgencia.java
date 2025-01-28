package Vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class NuevaAgencia extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textNombreA;
	private JTextField textColorM;
	private JTextField textNumEm;
	private JTextField textTipoA;
	private JTextField textLogo;
	
	
	public NuevaAgencia(VentanasViajes v) {
		// TODO Auto-generated constructor stub
		
		
		setBackground(Color.DARK_GRAY);
		
		
		setSize(1250, 720);
		setVisible(true);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(201, 36, 900, 600);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNombreA = new JLabel("NOMBRE AGENCIA");
		lblNombreA.setBounds(10, 208, 90, 14);
		panel.add(lblNombreA);
		
		JLabel lblColorM = new JLabel("COLOR MARCA");
		lblColorM.setBounds(10, 293, 90, 14);
		panel.add(lblColorM);
		
		JLabel lblNumEmp = new JLabel("NUMERO DE EMPLEADOS");
		lblNumEmp.setBounds(10, 346, 129, 14);
		panel.add(lblNumEmp);
		
		JLabel lblTipoA = new JLabel("TIPO DE AGENCIA");
		lblTipoA.setBounds(10, 400, 129, 14);
		panel.add(lblTipoA);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setBounds(10, 489, 46, 14);
		panel.add(lblLogo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(0);
			}
		});
		btnGuardar.setBounds(211, 526, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(0);
			}
		});
		btnCancelar.setBounds(579, 526, 89, 23);
		panel.add(btnCancelar);
		
		textNombreA = new JTextField();
		textNombreA.setBounds(198, 205, 183, 20);
		panel.add(textNombreA);
		textNombreA.setColumns(10);
		
		textColorM = new JTextField();
		textColorM.setBounds(198, 290, 183, 20);
		panel.add(textColorM);
		textColorM.setColumns(10);
		
		textNumEm = new JTextField();
		textNumEm.setBounds(198, 343, 183, 20);
		panel.add(textNumEm);
		textNumEm.setColumns(10);
		
		textTipoA = new JTextField();
		textTipoA.setBounds(198, 397, 183, 20);
		panel.add(textTipoA);
		textTipoA.setColumns(10);
		
		textLogo = new JTextField();
		textLogo.setBounds(198, 486, 183, 20);
		panel.add(textLogo);
		textLogo.setColumns(10);
		
		
	}
}
