package cibertec;

import java.awt.EventQueue;

import clases.Cliente;
import clases.Producto;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class DialogoProductos extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblPrecio;
	private JButton btnAgregar;
	private JButton btnNuevo;
	private JButton btnCancelar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnListar;
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JButton btnConsultar;
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
					DialogoProductos dialog = new DialogoProductos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
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
		setBounds(100, 100, 698, 442);
		getContentPane().setLayout(null);

		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 57, 23);
		getContentPane().add(lblCodigo);

		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(10, 38, 81, 14);
		getContentPane().add(lblDescripcion);

		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(10, 63, 81, 19);
		getContentPane().add(lblPrecio);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAgregar.setBounds(549, 13, 98, 23);
		getContentPane().add(btnAgregar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificar.setBounds(437, 47, 91, 26);
		getContentPane().add(btnModificar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnListar.setBounds(437, 81, 91, 26);
		getContentPane().add(btnListar);

		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(101, 37, 209, 20);
		getContentPane().add(txtDescripcion);

		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrecio.setBounds(101, 62, 209, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCodigo = new JTextField();
		txtCodigo.setText("1001");
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(101, 10, 108, 20);
		getContentPane().add(txtCodigo);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultar.setBounds(219, 9, 91, 23);
		getContentPane().add(btnConsultar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 173, 636, 219);
		getContentPane().add(scrollPane);

		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Descripcion");
		modelo.addColumn("Precio");

		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		tblTabla.setModel(modelo);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnEliminar(e);
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(549, 47, 98, 26);
		getContentPane().add(btnEliminar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(549, 81, 98, 26);
		getContentPane().add(btnCancelar);

		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(this);
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNuevo.setBounds(437, 13, 91, 23);
		getContentPane().add(btnNuevo);

		iniciarVentana();

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
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
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

	public void limpiar() {
		txtCodigo.setText("");
		txtCodigo.requestFocusInWindow();
		txtDescripcion.setText("");
		txtPrecio.setText("");
	}

	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < Tienda.PRODUCTOS.tamaño(); i++) {
			Producto p = Tienda.PRODUCTOS.obtener(i);
			agregarFila(p);
		}
	}

	public void agregarFila(Producto p) {
		Object[] fila = { p.getCodigo(), p.getDescripcion(), p.getPrecio() };
		modelo.addRow(fila);
	}

	public void mostrarDatos(Producto p) {
		String descripcion = p.getDescripcion();
		double precio = p.getPrecio();

		txtDescripcion.setText(descripcion);
		txtPrecio.setText(precio + "");
	}

	protected void actionPerformedBtnConsultar(ActionEvent e) {
		if (txtCodigo.getText().length() != 0) {
			Producto p = Tienda.PRODUCTOS.buscar(leerCodigo());
			if (p != null) {
				modelo.setRowCount(0);
				agregarFila(p);
				mostrarDatos(p);

				btnAgregar.setEnabled(false);
				btnNuevo.setEnabled(false);
				btnListar.setEnabled(false);

				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnCancelar.setEnabled(true);

			} else {
				JOptionPane.showMessageDialog(this, "No existe un producto con ese código", "Código no encontrado",
						JOptionPane.ERROR_MESSAGE);
				txtCodigo.setText("");
				txtCodigo.requestFocusInWindow();
			}
		} else {
			JOptionPane.showMessageDialog(this, "Escribe un codigo para buscar");
		}
	}

	public void editar(boolean value) {
		txtCodigo.setEnabled(!value);
		btnConsultar.setEnabled(!value);
		btnListar.setEnabled(!value);
		btnNuevo.setEnabled(!value);

		btnCancelar.setEnabled(value);
		txtDescripcion.setEnabled(value);
		txtPrecio.setEnabled(value);
		
	}

	protected void actionPerformedBtnNuevo(ActionEvent e) {
		editar(true);
		btnAgregar.setEnabled(true);
		btnListar.setEnabled(false);
		btnNuevo.setEnabled(false);
		txtCodigo.setText(Tienda.PRODUCTOS.generarCodigo() + "");
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		iniciarVentana();
	}

	protected void actionPerformedBtnAgregar(ActionEvent e) {

		if (leerDescripcion().length() != 0 && txtPrecio.getText().length() != 0 && leerPrecio() > 0) {

			Producto p = Tienda.PRODUCTOS.buscar(leerCodigo());
			if (p == null) {
				Producto pro = new Producto(leerCodigo(), leerDescripcion(), leerPrecio());
				Tienda.PRODUCTOS.agregar(pro);
				JOptionPane.showMessageDialog(this, "Producto creado exitosamente");
			} else {
				p.setCodigo(leerCodigo());
				p.setDescripcion(leerDescripcion());
				p.setPrecio(leerPrecio());

				JOptionPane.showMessageDialog(this, "Producto modificado correctamente");
			}
			iniciarVentana();
		} else {
			if (leerPrecio() <= 0) {
				JOptionPane.showMessageDialog(this, "Coloca un precio mayor a 0");
				return;
			};
			JOptionPane.showMessageDialog(this, "Rellena todos los campos");
			if (leerDescripcion().length() == 0)
				txtDescripcion.requestFocusInWindow();
			if (txtPrecio.getText().length() == 0) txtPrecio.requestFocusInWindow();

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
		int dialogResult = JOptionPane.showConfirmDialog(this, "Deseas eliminar el producto " + leerCodigo() + "?",
				"Eliminar cliente", JOptionPane.YES_NO_OPTION);
		if (dialogResult == 0) {
			Cliente c = Tienda.CLIENTES.buscar(leerCodigo());
			Tienda.CLIENTES.eliminar(c);
			JOptionPane.showMessageDialog(this, "Producto eliminado");
		}
		iniciarVentana();

	}

	public int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}

	public String leerDescripcion() {
		return txtDescripcion.getText().trim();
	}

	public double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText().trim());
	}


}
