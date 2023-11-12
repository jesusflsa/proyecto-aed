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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoVender extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		
		lblCodigoDeVenta = new JLabel("C\u00F3digo de venta");
		lblCodigoDeVenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeVenta.setBounds(10, 11, 148, 17);
		contentPanel.add(lblCodigoDeVenta);
		
		lblCodigoDeCliente = new JLabel("C\u00F3digo de cliente");
		lblCodigoDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeCliente.setBounds(10, 36, 148, 18);
		contentPanel.add(lblCodigoDeCliente);
		
		lblCodigoDeProducto = new JLabel("C\u00F3digo de producto");
		lblCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeProducto.setBounds(10, 61, 164, 19);
		contentPanel.add(lblCodigoDeProducto);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(10, 87, 148, 18);
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
		cboCodigoDeProducto.setModel(new DefaultComboBoxModel(new String[] {"3001", "3002", "3003", "3004", "3005"}));
		cboCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodigoDeProducto.setBounds(177, 59, 173, 22);
		contentPanel.add(cboCodigoDeProducto);
		
		cboCodigoDeCliente = new JComboBox();
		cboCodigoDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodigoDeCliente.setModel(new DefaultComboBoxModel(new String[] {"1001", "1002", "1003", "1004", "1005"}));
		cboCodigoDeCliente.setBounds(177, 32, 173, 22);
		contentPanel.add(cboCodigoDeCliente);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(364, 6, 104, 23);
		contentPanel.add(btnAceptar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevo.setBounds(675, 9, 104, 23);
		contentPanel.add(btnNuevo);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
