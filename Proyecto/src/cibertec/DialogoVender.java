package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class DialogoVender extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private TextArea textArea;
	private JLabel lblCodigoDeVenta;
	private JLabel lblCodigoDeCliente;
	private JLabel lblCodigoDeProducto;
	private JLabel lblCantidad;
	private JTextField txtCodigoDeVenta;
	private JTextField txtCantidad;
	private JComboBox<?> cboCodigoDeProducto;
	private JComboBox<?> cboCodigoDeCliente;
	private JButton btnAceptar;
	private JButton btnNuevo;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setTitle("Vender");
		setBounds(100, 100, 810, 497);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textArea = new TextArea();
		textArea.setBounds(10, 115, 774, 333);
		contentPanel.add(textArea);
		
		lblCodigoDeVenta = new JLabel("CODIGO DE VENTA:");
		lblCodigoDeVenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeVenta.setBounds(10, 11, 148, 14);
		contentPanel.add(lblCodigoDeVenta);
		
		lblCodigoDeCliente = new JLabel("CODIGO DE CLIENTE");
		lblCodigoDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeCliente.setBounds(10, 36, 148, 14);
		contentPanel.add(lblCodigoDeCliente);
		
		lblCodigoDeProducto = new JLabel("CODIGO DE PRODUCTO:");
		lblCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeProducto.setBounds(10, 61, 164, 14);
		contentPanel.add(lblCodigoDeProducto);
		
		lblCantidad = new JLabel("CANTIDAD:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(10, 87, 148, 14);
		contentPanel.add(lblCantidad);
		
		txtCodigoDeVenta = new JTextField();
		txtCodigoDeVenta.setText("4001");
		txtCodigoDeVenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigoDeVenta.setBounds(178, 8, 172, 20);
		contentPanel.add(txtCodigoDeVenta);
		txtCodigoDeVenta.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(177, 86, 172, 20);
		contentPanel.add(txtCantidad);
		
		cboCodigoDeProducto = new JComboBox();
		cboCodigoDeProducto.setModel(new DefaultComboBoxModel(new String[] {"3001"}));
		cboCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodigoDeProducto.setBounds(177, 59, 173, 22);
		contentPanel.add(cboCodigoDeProducto);
		
		cboCodigoDeCliente = new JComboBox();
		cboCodigoDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodigoDeCliente.setModel(new DefaultComboBoxModel(new String[] {"1001"}));
		cboCodigoDeCliente.setBounds(177, 32, 173, 22);
		contentPanel.add(cboCodigoDeCliente);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(364, 6, 104, 23);
		contentPanel.add(btnAceptar);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevo.setBounds(675, 9, 104, 23);
		contentPanel.add(btnNuevo);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpiar.setBounds(677, 41, 104, 23);
		contentPanel.add(btnLimpiar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
