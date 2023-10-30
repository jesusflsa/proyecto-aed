package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.UIManager;

public class DialogoClientes extends JDialog implements ActionListener {
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnListado;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtNombres;
	private JTextField txtCodigo;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JButton btnAceptar;
	private TextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoClientes dialog = new DialogoClientes();
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
	public DialogoClientes() {
		setTitle("Clientes");
		setBounds(100, 100, 698, 667);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("C\u00D3DIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 57, 14);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("NOMBRES:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(10, 38, 81, 14);
		getContentPane().add(lblNombres);
		
		lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 63, 81, 14);
		getContentPane().add(lblApellidos);
		
		lblDireccion = new JLabel("DIRECCI\u00D3N:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccion.setBounds(10, 88, 81, 14);
		getContentPane().add(lblDireccion);
		
		lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 114, 81, 14);
		getContentPane().add(lblTelefono);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(10, 139, 67, 14);
		getContentPane().add(lblDni);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngreso.setBounds(545, 34, 127, 23);
		getContentPane().add(btnIngreso);
		
		btnModificacion = new JButton("Modificacion");
		btnModificacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificacion.setBounds(545, 59, 127, 23);
		getContentPane().add(btnModificacion);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsulta.setBounds(545, 84, 127, 23);
		getContentPane().add(btnConsulta);
		
		btnEliminacion = new JButton("Eliminacion");
		btnEliminacion.addActionListener(this);
		btnEliminacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminacion.setBounds(545, 110, 127, 23);
		getContentPane().add(btnEliminacion);
		
		btnListado = new JButton("Listado");
		btnListado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListado.setBounds(545, 135, 127, 23);
		getContentPane().add(btnListado);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtApellidos.setBounds(101, 62, 209, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(101, 87, 209, 20);
		getContentPane().add(txtDireccion);
		
		txtNombres = new JTextField();
		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombres.setColumns(10);
		txtNombres.setBounds(101, 37, 209, 20);
		getContentPane().add(txtNombres);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("1001");
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(101, 10, 108, 20);
		getContentPane().add(txtCodigo);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(101, 112, 209, 20);
		getContentPane().add(txtTelefono);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDNI.setColumns(10);
		txtDNI.setBounds(101, 136, 209, 20);
		getContentPane().add(txtDNI);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(219, 9, 89, 23);
		getContentPane().add(btnAceptar);
		
		txtS = new TextArea();
		txtS.setBounds(10, 412, 662, 206);
		getContentPane().add(txtS);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminacion) {
			actionPerformedBtnIngreso_3(e);
		}
	}
	protected void actionPerformedBtnIngreso_3(ActionEvent e) {
	}
}
