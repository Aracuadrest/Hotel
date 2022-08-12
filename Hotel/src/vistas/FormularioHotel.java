package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioHotel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private final ButtonGroup GrupoRegimen = new ButtonGroup();
	private JComboBox comboBoxHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioHotel frame = new FormularioHotel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioHotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][][][grow]"));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 0 0,alignx trailing");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 1 0,growx");
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblApellidos, "cell 0 1,alignx trailing");
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtApellidos.setColumns(10);
		contentPane.add(txtApellidos, "cell 1 1,growx");
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblDni, "cell 0 2,alignx trailing");
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDni.setColumns(10);
		contentPane.add(txtDni, "cell 1 2,growx");
		
		JLabel lblHabitacion = new JLabel("Habitaci\u00F3n:");
		lblHabitacion.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblHabitacion, "cell 0 3,alignx trailing");
		
		 comboBoxHabitacion = new JComboBox();
		comboBoxHabitacion.setModel(new DefaultComboBoxModel(new String[] {"Individual", "Doble", "Triple", "Suit Deluxe"}));
		comboBoxHabitacion.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(comboBoxHabitacion, "cell 1 3,growx");
		
		JLabel lblRegimen = new JLabel("R\u00E9gimen:");
		lblRegimen.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblRegimen, "cell 0 4,alignx right");
		
		JRadioButton rdbtnDesayuno = new JRadioButton("Desayuno");
		GrupoRegimen.add(rdbtnDesayuno);
		rdbtnDesayuno.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnDesayuno, "flowx,cell 1 4");
		
		JRadioButton rdbtnMediaPension = new JRadioButton("Media Pensi\u00F3n");
		GrupoRegimen.add(rdbtnMediaPension);
		rdbtnMediaPension.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnMediaPension, "cell 1 4");
		
		JRadioButton rdbtnPensionCompleta = new JRadioButton("Pensi\u00F3n Completa");
		GrupoRegimen.add(rdbtnPensionCompleta);
		rdbtnPensionCompleta.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnPensionCompleta, "flowx,cell 1 5");
		
		JLabel lblNumNoches = new JLabel("Num. Noches:");
		lblNumNoches.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNumNoches, "cell 0 6");
		
		JRadioButton rdbtnSuite = new JRadioButton("Suite Deluxe");
		GrupoRegimen.add(rdbtnSuite);
		rdbtnSuite.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnSuite, "cell 1 5");
		
		JSpinner spinnerNumNoches = new JSpinner();
		spinnerNumNoches.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spinnerNumNoches.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(spinnerNumNoches, "cell 1 6");
		
		JButton btnCalcular = new JButton("Calcular Importe");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularImporte();
			}
		});
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnCalcular, "cell 1 7");
		
		JLabel lblResumen = new JLabel("Resumen:");
		lblResumen.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblResumen, "flowy,cell 1 8");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 1 8,grow");
	}

	protected void calcularImporte() {
		
		String nombre = txtNombre.getText();
		String apellidos = txtApellidos.getText();
		String dni = txtDni.getText();
		String habitacion = comboBoxHabitacion.getName();
		//String regimen = GrupoRegimen.
				
		
		
		
		
	}

}
