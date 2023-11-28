package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.Vendedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class DialogoVendedores extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	private JButton btnNuevo;
	@SuppressWarnings("rawtypes")
	private JComboBox cboCategoria;
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnListar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JButton btnAgregar;
	private JSeparator separator;

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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DialogoVendedores() {
		setTitle("Vendedores");
		setBounds(100, 100, 631, 439);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(13, 8, 94, 14);
		contentPanel.add(lblCodigo);

		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(13, 33, 94, 14);
		contentPanel.add(lblCategoria);

		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(13, 58, 94, 14);
		contentPanel.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(13, 84, 94, 14);
		contentPanel.add(lblApellidos);

		JLabel lblTelefono = new JLabel("Telef\u00F3no:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(13, 109, 94, 14);
		contentPanel.add(lblTelefono);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(13, 134, 94, 14);
		contentPanel.add(lblDni);

		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigo.setBounds(88, 7, 110, 20);
		contentPanel.add(txtCodigo);

		txtCodigo.setColumns(10);
		txtNombres = new JTextField();
		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombres.setColumns(10);
		txtNombres.setBounds(88, 58, 110, 20);
		contentPanel.add(txtNombres);

		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(88, 83, 110, 20);
		contentPanel.add(txtApellidos);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(88, 108, 110, 20);
		contentPanel.add(txtTelefono);

		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDNI.setColumns(10);
		txtDNI.setBounds(88, 134, 110, 20);
		contentPanel.add(txtDNI);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(204, 5, 110, 23);
		contentPanel.add(btnBuscar);

		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(this);
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevo.setBounds(342, 5, 125, 23);
		contentPanel.add(btnNuevo);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificar.setBounds(342, 33, 125, 23);
		contentPanel.add(btnModificar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListar.setBounds(342, 59, 125, 23);
		contentPanel.add(btnListar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBounds(476, 32, 125, 23);
		contentPanel.add(btnEliminar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(476, 59, 125, 23);
		contentPanel.add(btnCancelar);

		cboCategoria = new JComboBox();
		cboCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCategoria.setModel(new DefaultComboBoxModel(Tienda.VENDEDORES.categorias));
		cboCategoria.setBounds(88, 31, 110, 22);
		contentPanel.add(cboCategoria);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(13, 170, 585, 217);
		contentPanel.add(scrollPane);

		modelo = new DefaultTableModel();
		modelo.addColumn("C\u00F3digo");
		modelo.addColumn("Categor\u00EDa");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Telef\u00F3no");
		modelo.addColumn("DNI");

		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		tblTabla.setModel(modelo);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(331, 6, 1, 150);
		contentPanel.add(separator);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAgregar.setBounds(476, 5, 125, 23);
		contentPanel.add(btnAgregar);


		iniciarVentana();

	}

	public void iniciarVentana() {
		limpiar();
		listar();
		editar(false);
		txtCodigo.setFocusable(true);
		btnModificar.setEnabled(false);
		btnAgregar.setEnabled(false);
		btnEliminar.setEnabled(false);

	}

	public void editar(boolean value) {
		txtCodigo.setEnabled(!value);
		btnBuscar.setEnabled(!value);
		btnListar.setEnabled(!value);
		btnNuevo.setEnabled(!value);

		btnCancelar.setEnabled(value);
		cboCategoria.setEnabled(value);
		txtNombres.setEnabled(value);
		txtApellidos.setEnabled(value);
		txtTelefono.setEnabled(value);
		txtDNI.setEnabled(value);
	}

	public void limpiar() {
		txtCodigo.setText("");
		txtCodigo.requestFocusInWindow();
		cboCategoria.setSelectedIndex(0);
		txtNombres.setText("");
		txtApellidos.setText("");
		txtTelefono.setText("");
		txtDNI.setText("");
	}

	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < Tienda.VENDEDORES.tamaño(); i++) {
			Vendedor v = Tienda.VENDEDORES.obtener(i);
			agregarFila(v);
		}
	}

	public void agregarFila(Vendedor v) {
		String categoria = Tienda.VENDEDORES.nombreCategoria(v.getCategoria());
		Object[] fila = { v.getCodigo(), categoria, v.getNombres(), v.getApellidos(), v.getTelefono(), v.getDni() };
		modelo.addRow(fila);
	}

	public void mostrarDatos(Vendedor v) {
		int categoria = v.getCategoria();
		String nombres = v.getNombres();
		String apellidos = v.getApellidos();
		String telefono = v.getTelefono();
		String dni = v.getDni();

		cboCategoria.setSelectedIndex(categoria);
		txtNombres.setText(nombres);
		txtApellidos.setText(apellidos);
		txtTelefono.setText(telefono);
		txtDNI.setText(dni);
	}

	public int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}

	public int leerCategoria() {
		return cboCategoria.getSelectedIndex();
	}

	public String leerNombres() {
		return txtNombres.getText().trim();
	}

	public String leerApellidos() {
		return txtApellidos.getText().trim();
	}

	public String leerTelefono() {
		return txtTelefono.getText().trim();
	}

	public String leerDni() {
		return txtDNI.getText().trim();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}

	protected void actionPerformedBtnBuscar(ActionEvent e) {
		if (txtCodigo.getText().length() != 0) {
			Vendedor v = Tienda.VENDEDORES.buscar(leerCodigo());
			if (v != null) {
				modelo.setRowCount(0);
				agregarFila(v);
				mostrarDatos(v);

				btnAgregar.setEnabled(false);
				btnNuevo.setEnabled(false);
				btnListar.setEnabled(false);

				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnCancelar.setEnabled(true);

			} else {
				JOptionPane.showMessageDialog(this, "No existe un vendedor con ese c\u00F3digo",
						"C\u00F3digo no encontrado", JOptionPane.ERROR_MESSAGE);
				txtCodigo.setText("");
				txtCodigo.requestFocusInWindow();
			}
		} else {
			JOptionPane.showMessageDialog(this, "Escribe un codigo para buscar");
		}
	}

	protected void actionPerformedBtnNuevo(ActionEvent e) {
		editar(true);
		btnAgregar.setEnabled(true);
		btnListar.setEnabled(false);
		btnNuevo.setEnabled(false);
		txtCodigo.setText(Tienda.VENDEDORES.generarCodigo() + "");
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		iniciarVentana();
	}

	protected void actionPerformedBtnAgregar(ActionEvent e) {

		if (leerNombres().length() != 0 && leerApellidos().length() != 0 && leerTelefono().length() != 0
				&& leerDni().length() != 0) {

			Vendedor v = Tienda.VENDEDORES.buscar(leerCodigo());
			if (v == null) {
				Vendedor ven = new Vendedor(leerCodigo(), leerCategoria(), leerNombres(), leerApellidos(),
						leerTelefono(), leerDni());
				Tienda.VENDEDORES.agregar(ven);
				JOptionPane.showMessageDialog(this, "Vendedor creado exitosamente");
			} else {
				v.setCategoria(leerCategoria());
				v.setNombres(leerNombres());
				v.setApellidos(leerApellidos());
				v.setTelefono(leerTelefono());
				v.setDni(leerDni());

				JOptionPane.showMessageDialog(this, "Vendedor modificado correctamente");
			}
			iniciarVentana();
		} else {
			JOptionPane.showMessageDialog(this, "Rellena todos los campos");
			if (leerDni().length() == 0)
				txtDNI.requestFocusInWindow();
			if (leerTelefono().length() == 0)
				txtTelefono.requestFocusInWindow();
			if (leerApellidos().length() == 0)
				txtApellidos.requestFocusInWindow();
			if (leerNombres().length() == 0)
				txtNombres.requestFocusInWindow();
		}
	}

	protected void actionPerformedBtnModificar(ActionEvent e) {
		editar(true);
		btnModificar.setEnabled(false);
		btnEliminar.setEnabled(false);
		btnAgregar.setEnabled(true);
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		limpiar();
		editar(false);
		listar();
	}

	protected void actionPerformedBtnEliminar(ActionEvent e) {
		int dialogResult = JOptionPane.showConfirmDialog(this, "Deseas eliminar el vendedor " + leerCodigo() + "?",
				"Eliminar vendedor", JOptionPane.YES_NO_OPTION);
		if (dialogResult == 0) {
			Vendedor v = Tienda.VENDEDORES.buscar(leerCategoria());
			Tienda.VENDEDORES.eliminar(v);
			JOptionPane.showMessageDialog(this, "Vendedor eliminado");
		}
		iniciarVentana();

	}
}
