package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class NuevoEvento extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField textNombreEvento;

    public NuevoEvento(VentanasViajes v) {
        setBackground(Color.DARK_GRAY);
        setSize(1250, 720);
        setVisible(true);
        setLayout(null);

        // Create the CardLayout panel to hold different sub-panels
        JPanel cardPanel = new JPanel();
        cardPanel.setBounds(201, 36, 900, 600); // Adjust the size as needed
        add(cardPanel);
        CardLayout cardLayout = new CardLayout(); // Initialize CardLayout
        cardPanel.setLayout(cardLayout);

        // Create individual panels for "Vuelo", "Alojamiento", and "Actividad"
        JPanel vueloPanel = new JPanel();
        vueloPanel.setBackground(Color.LIGHT_GRAY);
        vueloPanel.add(new JLabel("Vuelo Panel"));

        JPanel alojamientoPanel = new JPanel();
        alojamientoPanel.setBackground(Color.PINK);
        alojamientoPanel.add(new JLabel("Alojamiento Panel"));

        JPanel actividadPanel = new JPanel();
        actividadPanel.setBackground(Color.CYAN);
        actividadPanel.add(new JLabel("Actividad Panel"));

        // Add the panels to the CardLayout container with unique identifiers
        cardPanel.add(new EventoVuelo(v), "Vuelo");
        cardPanel.add(new EventoAlojamiento(v), "Alojamiento");
        cardPanel.add(new EventoActividad(v), "Actividad");

        // Create the top panel for the combo box and text field
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBounds(201, 11, 900, 29);
        add(panel);
        panel.setLayout(null);

        JLabel lblTipoDeEvento = new JLabel("Tipo de Evento:");
        lblTipoDeEvento.setBounds(551, 8, 100, 14);
        panel.add(lblTipoDeEvento);

        textNombreEvento = new JTextField();
        textNombreEvento.setBounds(133, 5, 200, 20);
        panel.add(textNombreEvento);
        textNombreEvento.setColumns(10);

        JLabel lblNombreEvento = new JLabel("Nombre Evento:");
        lblNombreEvento.setBounds(22, 8, 100, 14);
        panel.add(lblNombreEvento);

        // ComboBox for selecting event type
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(690, 5, 151, 20);
        panel.add(comboBox);
        comboBox.setModel(new DefaultComboBoxModel<>(
                new String[]{"Selecciona Tipo de Evento", "Vuelo", "Alojamiento", "Actividad"}));

        // Add ActionListener to JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();

                switch (selectedItem) {
                    case "Vuelo":
                        cardLayout.show(cardPanel, "Vuelo");
                        break;

                    case "Alojamiento":
                        cardLayout.show(cardPanel, "Alojamiento");
                        break;

                    case "Actividad":
                        cardLayout.show(cardPanel, "Actividad");
                        break;

                    default: // For "Selecciona Tipo de Evento" or invalid selection
                        // Optionally handle invalid selections
                        break;
                }
            }
        });
    }
}
