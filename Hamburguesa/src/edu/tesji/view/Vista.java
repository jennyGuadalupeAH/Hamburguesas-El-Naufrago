package edu.tesji.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tesji.model.Proceso;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoja;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbHamburguesa = new JComboBox();
		cmbHamburguesa.setModel(new DefaultComboBoxModel(new String[] {"Tipo de Hamburguesa", "SENCILLAS", "DOBLES", "TRIPLES"}));
		cmbHamburguesa.setBounds(140, 54, 142, 29);
		contentPane.add(cmbHamburguesa);
		
		JComboBox cmbPago = new JComboBox();
		cmbPago.setModel(new DefaultComboBoxModel(new String[] {"Tipo de Pago", "TARJETA", "EFECTIVO"}));
		cmbPago.setBounds(140, 118, 142, 29);
		contentPane.add(cmbPago);
		
		txtHoja = new JTextField();
		txtHoja.setToolTipText("resltado");
		txtHoja.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoja.setBounds(10, 179, 525, 176);
		contentPane.add(txtHoja);
		txtHoja.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proceso misProcesos = new Proceso();
				
				 
				 misProcesos.tipoHam = cmbHamburguesa.getSelectedItem().toString();
				 misProcesos.tipoPag = cmbPago.getSelectedItem().toString();
				 misProcesos.Can=Double.parseDouble(txtCantidad.getText());
				 
				 String resultado=misProcesos.calcularDatos();
				 
				 txtHoja.setText(resultado + "");
				
				 
				 }
		});
		btnCalcular.setBounds(166, 387, 85, 21);
		contentPane.add(btnCalcular);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(47, 387, 85, 21);
		contentPane.add(btnSalir);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(292, 387, 85, 21);
		contentPane.add(btnNuevo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(150, 89, 52, 21);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
	}
}
