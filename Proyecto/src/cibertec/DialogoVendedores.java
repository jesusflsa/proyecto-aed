package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DialogoVendedores extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtCategoria;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JTable tblTabla;
	private DefaultTableModel modelo;

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
			DialogoVendedores dialog = new DialogoVendedores();
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
	public DialogoVendedores() {
		setTitle("Vendedores");
		setBounds(100, 100, 631, 439);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigo = new JLabel("C\u00F3digo:");
			lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCodigo.setBounds(13, 8, 94, 14);
			contentPanel.add(lblCodigo);
		}
		{
			JLabel lblCategoria = new JLabel("Categor\u00EDa:");
			lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCategoria.setBounds(13, 33, 94, 14);
			contentPanel.add(lblCategoria);
		}
		{
			JLabel lblNombres = new JLabel("Nombres:");
			lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombres.setBounds(13, 58, 94, 14);
			contentPanel.add(lblNombres);
		}
		{
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblApellidos.setBounds(13, 84, 94, 14);
			contentPanel.add(lblApellidos);
		}
		{
			JLabel lblTelefono = new JLabel("Telef\u00F3no:");
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblTelefono.setBounds(13, 109, 94, 14);
			contentPanel.add(lblTelefono);
		}
		{
			JLabel lblDni = new JLabel("DNI:");
			lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblDni.setBounds(13, 134, 94, 14);
			contentPanel.add(lblDni);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setText("2001");
			txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtCodigo.setBounds(102, 7, 86, 20);
			contentPanel.add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			txtCategoria = new JTextField();
			txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtCategoria.setColumns(10);
			txtCategoria.setBounds(102, 32, 146, 20);
			contentPanel.add(txtCategoria);
		}
		{
			txtNombres = new JTextField();
			txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtNombres.setColumns(10);
			txtNombres.setBounds(102, 58, 146, 20);
			contentPanel.add(txtNombres);
		}
		{
			txtApellidos = new JTextField();
			txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtApellidos.setColumns(10);
			txtApellidos.setBounds(102, 83, 146, 20);
			contentPanel.add(txtApellidos);
		}
		{
			txtTelefono = new JTextField();
			txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(102, 108, 146, 20);
			contentPanel.add(txtTelefono);
		}
		{
			txtDNI = new JTextField();
			txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtDNI.setColumns(10);
			txtDNI.setBounds(102, 134, 146, 20);
			contentPanel.add(txtDNI);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnAceptar.setBounds(198, 6, 118, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnIngreso = new JButton("Ingreso");
			btnIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnIngreso.setBounds(469, 9, 136, 23);
			contentPanel.add(btnIngreso);
		}
		{
			JButton btnModificacion = new JButton("Modificaci\u00F3n");
			btnModificacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnModificacion.setBounds(468, 37, 136, 23);
			contentPanel.add(btnModificacion);
		}
		{
			JButton btnConsulta = new JButton("Consulta");
			btnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnConsulta.setBounds(469, 65, 136, 23);
			contentPanel.add(btnConsulta);
		}
		{
			JButton btnEliminacion = new JButton("Eliminaci\u00F3n");
			btnEliminacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEliminacion.setBounds(469, 91, 136, 23);
			contentPanel.add(btnEliminacion);
		}
		{
			JButton btnListado = new JButton("Listado");
			btnListado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnListado.setBounds(468, 119, 136, 23);
			contentPanel.add(btnListado);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(13, 170, 585, 217);
			contentPanel.add(scrollPane);
			{
				modelo = new DefaultTableModel();
				modelo.addColumn("Código");
				modelo.addColumn("Categoría");
				modelo.addColumn("Nombres");
				modelo.addColumn("Apellidos");
				modelo.addColumn("Teléfono");
				modelo.addColumn("DNI");
				
			}
			{
				tblTabla = new JTable();
				tblTabla.setFillsViewportHeight(true);
				scrollPane.setViewportView(tblTabla);
				tblTabla.setModel(modelo);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	

}
