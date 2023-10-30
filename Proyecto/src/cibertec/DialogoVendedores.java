package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.UIManager;

public class DialogoVendedores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtCategoria;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDNI;

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
		setBounds(100, 100, 631, 583);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigo = new JLabel("CODIGO:");
			lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCodigo.setBounds(13, 8, 94, 14);
			contentPanel.add(lblCodigo);
		}
		{
			JLabel lblCategoria = new JLabel("CATEGORIA:");
			lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCategoria.setBounds(13, 33, 94, 14);
			contentPanel.add(lblCategoria);
		}
		{
			JLabel lblNombres = new JLabel("NOMBRES:");
			lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombres.setBounds(13, 58, 94, 14);
			contentPanel.add(lblNombres);
		}
		{
			JLabel lblApellidos = new JLabel("APELLIDOS:");
			lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblApellidos.setBounds(13, 84, 94, 14);
			contentPanel.add(lblApellidos);
		}
		{
			JLabel lblTelefono = new JLabel("TELEFONO:");
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
			JButton btnAceptar = new JButton("ACEPTAR");
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnAceptar.setBounds(198, 6, 118, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnIngreso = new JButton("INGRESO");
			btnIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnIngreso.setBounds(469, 29, 136, 23);
			contentPanel.add(btnIngreso);
		}
		{
			JButton btnModificacion = new JButton("MODIFICACION");
			btnModificacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnModificacion.setBounds(469, 54, 136, 23);
			contentPanel.add(btnModificacion);
		}
		{
			JButton btnConsulta = new JButton("CONSULTA");
			btnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnConsulta.setBounds(469, 80, 136, 23);
			contentPanel.add(btnConsulta);
		}
		{
			JButton btnEliminacion = new JButton("ELIMINACION");
			btnEliminacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEliminacion.setBounds(469, 105, 136, 23);
			contentPanel.add(btnEliminacion);
		}
		{
			JButton btnListado = new JButton("LISTADO");
			btnListado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnListado.setBounds(469, 132, 136, 23);
			contentPanel.add(btnListado);
		}
		{
			TextArea txtS = new TextArea();
			txtS.setBounds(13, 364, 592, 170);
			contentPanel.add(txtS);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
