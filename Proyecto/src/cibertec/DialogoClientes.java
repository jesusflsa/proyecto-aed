package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class DialogoClientes extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnListado;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtCodigo;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JButton btnAceptar;
	private DefaultTableModel modelo;
	private JTable tblTabla;

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
		setBounds(100, 100, 698, 442);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 57, 23);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(10, 38, 81, 14);
		getContentPane().add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 63, 81, 19);
		getContentPane().add(lblApellidos);
		
		lblTelefono = new JLabel("Telef\u00F3no:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 88, 81, 14);
		getContentPane().add(lblTelefono);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(10, 113, 67, 14);
		getContentPane().add(lblDni);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngreso.setBounds(545, 11, 127, 23);
		getContentPane().add(btnIngreso);
		
		btnModificacion = new JButton("Modificacion");
		btnModificacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificacion.setBounds(545, 38, 127, 23);
		getContentPane().add(btnModificacion);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsulta.setBounds(545, 63, 127, 23);
		getContentPane().add(btnConsulta);
		
		btnListado = new JButton("Listado");
		btnListado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListado.setBounds(545, 112, 127, 23);
		getContentPane().add(btnListado);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtApellidos.setBounds(101, 62, 209, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
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
		txtTelefono.setBounds(101, 85, 209, 20);
		getContentPane().add(txtTelefono);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDNI.setColumns(10);
		txtDNI.setBounds(101, 110, 209, 20);
		getContentPane().add(txtDNI);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(219, 9, 89, 23);
		getContentPane().add(btnAceptar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 173, 636, 219);
		getContentPane().add(scrollPane);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Teléfono");
		modelo.addColumn("DNI");
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		tblTabla.setModel(modelo);
		
		JButton btnEliminacion = new JButton("Eliminaci\u00F3n");
		btnEliminacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminacion.setBounds(547, 87, 124, 23);
		getContentPane().add(btnEliminacion);

	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	/*En el Design activar los actionPerformed de cada botón para su desarrollo*/
	

}


