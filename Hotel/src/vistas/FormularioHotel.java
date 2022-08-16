package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class FormularioHotel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private final ButtonGroup GrupoRegimen = new ButtonGroup();
	private JComboBox comboBoxHabitacion;
	private JRadioButton rdbtnPensionCompleta;
	private JRadioButton rdbtnDesayuno;
	private JRadioButton rdbtnMediaPension;
	private JRadioButton rdbtnTodo;
	private JSpinner spinnerNumNoches;
	private JTextArea txtAreaResumen;
	private JScrollPane scrollPane;

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
		setBounds(100, 100, 450, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][][40.00][][302.00,grow]"));
		
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
		
		 rdbtnDesayuno = new JRadioButton("Desayuno");
		rdbtnDesayuno.setSelected(true);
		GrupoRegimen.add(rdbtnDesayuno);
		rdbtnDesayuno.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnDesayuno, "flowx,cell 1 4");
		
		 rdbtnMediaPension = new JRadioButton("Media Pensi\u00F3n");
		GrupoRegimen.add(rdbtnMediaPension);
		rdbtnMediaPension.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnMediaPension, "cell 1 4");
		
		 rdbtnPensionCompleta = new JRadioButton("Pensi\u00F3n Completa");
		GrupoRegimen.add(rdbtnPensionCompleta);
		rdbtnPensionCompleta.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnPensionCompleta, "flowx,cell 1 5");
		
		JLabel lblNumNoches = new JLabel("Num. Noches:");
		lblNumNoches.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNumNoches, "cell 0 6");
		
		 rdbtnTodo = new JRadioButton("Todo incluido");
		GrupoRegimen.add(rdbtnTodo);
		rdbtnTodo.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbtnTodo, "cell 1 5");
		
		spinnerNumNoches = new JSpinner();
		spinnerNumNoches.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spinnerNumNoches.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(spinnerNumNoches, "cell 1 6");
		
		JButton btnCalcular = new JButton("Calcular Importe");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarYcalcular();
			}
		});
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnCalcular, "cell 1 7");
		
		JLabel lblResumen = new JLabel("Resumen:");
		lblResumen.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblResumen, "cell 0 8,alignx right");
		 
		 scrollPane = new JScrollPane();
		 contentPane.add(scrollPane, "cell 0 9 2 1,grow");
		
		 txtAreaResumen = new JTextArea();
		 scrollPane.setViewportView(txtAreaResumen);
	}

	protected void validarYcalcular() {
		
		if (txtNombre.getText()==null || txtNombre.getText().isBlank() ||
				txtApellidos.getText()==null || txtApellidos.getText().isBlank() ||
				txtDni.getText()==null || txtDni.getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Debe introducir los campos de nombre, apellidos y DNI.", 
					"Compruebe los datos", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String nombre = txtNombre.getText();
		String apellidos = txtApellidos.getText();
		String dni = txtDni.getText();
		String tipo = (String) comboBoxHabitacion.getSelectedItem();
		String regimen = "Desayuno";
		int precio =60;
		
		if (tipo.equals("Doble")) {
			precio=85;
		}else if (tipo.equals("Triple")) {
			precio=102;
		}else if (tipo.equals("Suit Deluxe")) {
			precio=350;
		}
		if (rdbtnDesayuno.isSelected()) {
			precio=precio+3;
		}
		if (rdbtnMediaPension.isSelected()) {
			regimen="Media Pensión";
			precio=precio+5;
		}
		if (rdbtnPensionCompleta.isSelected()) {
			regimen="Pensión Completa";
			precio=precio+7;
		}
		if (rdbtnTodo.isSelected()) {
			regimen="Todo Incluido";
			precio=precio+16;
		}
		int noches = (int) spinnerNumNoches.getValue();
		
		precio = precio*noches;
		
		txtAreaResumen.setText(
				"Nombre: "+nombre+ "\n"+
				"Apellidos: "+apellidos+ "\n"+
				"Dni: "+dni+ "\n"+
				"Habitación: "+tipo+ "\n"+
				"Régimen: "+regimen+ "\n"+
				"Num Noches: "+noches+ "\n"+
				"Total: "+precio);
	
		}
	
		
	}


