package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;

public class DialogoProductos extends JDialog {
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblPrecio;
	private JTextField txtDescripcion;
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JButton btnAceptar;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnListado;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoProductos dialog = new DialogoProductos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoProductos() {
		setTitle("Productos");
		setBounds(100, 100, 664, 464);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("CODIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 91, 14);
		getContentPane().add(lblCodigo);
		
		lblDescripcion = new JLabel("DESCRIPCION:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(10, 36, 107, 14);
		getContentPane().add(lblDescripcion);
		
		lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(10, 64, 91, 14);
		getContentPane().add(lblPrecio);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescripcion.setBounds(111, 35, 141, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigo.setText("2001");
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(111, 10, 141, 20);
		getContentPane().add(txtCodigo);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(111, 61, 141, 20);
		getContentPane().add(txtPrecio);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(262, 9, 126, 23);
		getContentPane().add(btnAceptar);
		
		btnIngreso = new JButton("INGRESO");
		btnIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngreso.setBounds(512, 9, 126, 23);
		getContentPane().add(btnIngreso);
		
		btnModificacion = new JButton("MODIFICACION");
		btnModificacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificacion.setBounds(512, 39, 126, 23);
		getContentPane().add(btnModificacion);
		
		btnConsulta = new JButton("CONSULTA");
		btnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsulta.setBounds(514, 70, 126, 23);
		getContentPane().add(btnConsulta);
		
		btnEliminacion = new JButton("ELIMINACION");
		btnEliminacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminacion.setBounds(515, 100, 126, 23);
		getContentPane().add(btnEliminacion);
		
		btnListado = new JButton("LISTADO");
		btnListado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListado.setBounds(515, 130, 126, 23);
		getContentPane().add(btnListado);
		
		textArea = new TextArea();
		textArea.setBounds(9, 159, 631, 257);
		getContentPane().add(textArea);

	}

}
