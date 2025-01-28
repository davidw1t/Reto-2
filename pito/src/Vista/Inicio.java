package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtAgencyName;
	private JTextField txtPassword;

	/**
	 * Create the panel.
	 */
	public Inicio(VentanasViajes v) {
		setBackground(Color.white);
		
		
		setSize(1250, 720);
		setVisible(true);
		setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(201, 36, 900, 600);
		add(panel);
		panel.setLayout(null);
		
		JButton btnUp = new JButton("Sign Up");
		btnUp.setBounds(537, 293, 150, 30);
		panel.add(btnUp);
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.cambiarPanel(1);
			}
		});
		btnUp.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnIn = new JButton("Sign In");
		btnIn.setBounds(203, 293, 150, 30);
		panel.add(btnIn);
		btnIn.addActionListener(new ActionListener() {
			@Override
		           public void actionPerformed(ActionEvent e) {
		                // Validate username and password
		                String agencyName = txtAgencyName.getText();
		                String password = txtPassword.getText();

		                if ("admin".equalsIgnoreCase(agencyName) && "admin".equalsIgnoreCase(password)) {
		                    // Switch to the desired panel if credentials are correct
		                    v.cambiarPanel(2);
		                } else {
		                    // Show error message
		                    JOptionPane.showMessageDialog(null, 
		                        "Invalid username or password!", 
		                        "Login Error", 
		                        JOptionPane.ERROR_MESSAGE);
		                }
		            }
		});
		btnIn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtAgencyName = new JTextField();
		txtAgencyName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAgencyName.setEditable(true);
				txtAgencyName.setText("");
			}
		});
		txtAgencyName.setEditable(false);
		txtAgencyName.setBounds(371, 136, 150, 40);
		panel.add(txtAgencyName);
		txtAgencyName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtAgencyName.setText("Agency Name");
		txtAgencyName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setBounds(371, 218, 150, 40);
		panel.add(txtPassword);
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		txtPassword.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtPassword.setEditable(true);
				txtPassword.setText("");
			}
		
		
		});
		}


		
		
	
}

