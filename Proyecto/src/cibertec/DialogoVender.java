package cibertec;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.Factura;
import clases.Producto;
import clases.Vendedor;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoVender extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCliente;
	private JTextField txtCliente;
	private JLabel lblVendedor;
	private JTextField txtVendedor;
	private JLabel lblProducto;
	private JTextField txtProducto;
	private JButton btnVender;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnBuscar;
	private JTextField txtNombreCliente;
	private JTextField txtNombreVendedor;
	private JTextField txtNombreProducto;
	private JButton btnCancelar;

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
		} catch (Exception e) {
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

		lblCliente = new JLabel("Código del cliente");
		lblCliente.setBounds(26, 26, 107, 14);
		contentPanel.add(lblCliente);

		txtCliente = new JTextField();
		txtCliente.setBounds(143, 23, 120, 20);
		contentPanel.add(txtCliente);
		txtCliente.setColumns(10);

		txtNombreCliente = new JTextField();
		txtNombreCliente.setEditable(false);
		txtNombreCliente.setBounds(273, 23, 260, 20);
		contentPanel.add(txtNombreCliente);
		txtNombreCliente.setColumns(10);

		lblVendedor = new JLabel("Código del vendedor");
		lblVendedor.setBounds(26, 51, 107, 14);
		contentPanel.add(lblVendedor);

		txtVendedor = new JTextField();
		txtVendedor.setColumns(10);
		txtVendedor.setBounds(143, 48, 120, 20);
		contentPanel.add(txtVendedor);

		txtNombreVendedor = new JTextField();
		txtNombreVendedor.setEditable(false);
		txtNombreVendedor.setColumns(10);
		txtNombreVendedor.setBounds(273, 48, 260, 20);
		contentPanel.add(txtNombreVendedor);

		lblProducto = new JLabel("Código del producto");
		lblProducto.setBounds(26, 76, 107, 14);
		contentPanel.add(lblProducto);

		txtProducto = new JTextField();
		txtProducto.setColumns(10);
		txtProducto.setBounds(143, 73, 120, 20);
		contentPanel.add(txtProducto);

		txtNombreProducto = new JTextField();
		txtNombreProducto.setEditable(false);
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(273, 73, 260, 20);
		contentPanel.add(txtNombreProducto);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(26, 101, 107, 14);
		contentPanel.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.setEnabled(false);
		txtCantidad.setBounds(143, 98, 120, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnVender = new JButton("Vender");
		btnVender.setEnabled(false);
		btnVender.addActionListener(this);
		btnVender.setBounds(679, 47, 89, 23);
		contentPanel.add(btnVender);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 141, 742, 284);
		contentPanel.add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(679, 22, 89, 23);
		contentPanel.add(btnBuscar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(679, 72, 89, 23);
		contentPanel.add(btnCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}

	void imprimir(String str) {
		txtS.append(str + "\n");
	}

	int leerCliente() {
		return Integer.parseInt(txtCliente.getText().trim());
	}

	int leerVendedor() {
		return Integer.parseInt(txtVendedor.getText().trim());
	}

	int leerProducto() {
		return Integer.parseInt(txtProducto.getText().trim());
	}

	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText().trim());
	}

	String descripcion() {
		return Tienda.PRODUCTOS.buscar(leerProducto()).getDescripcion();
	}

	double precio() {
		return Tienda.PRODUCTOS.buscar(leerProducto()).getPrecio();
	}

	double importeCompra() {
		return precio() * leerCantidad();
	}

	public boolean validarCliente() {
		if (txtCliente.getText().length() != 0 && Tienda.CLIENTES.buscar(leerCliente()) != null) {
			return true;
		}
		return false;
	}

	public boolean validarVendedor() {
		if (txtVendedor.getText().length() != 0 && Tienda.VENDEDORES.buscar(leerVendedor()) != null) {
			return true;
		}
		return false;
	}

	public boolean validarProducto() {
		if (txtVendedor.getText().length() != 0 && Tienda.PRODUCTOS.buscar(leerProducto()) != null) {
			return true;
		}
		return false;
	}

	public boolean validarCantidad() {
		if (txtCantidad.getText().length() != 0) {
			return true;
		} else {
			txtCantidad.requestFocusInWindow();
			return false;
		}
	}

	public void mostrarFactura() {
		txtS.setText("");
		imprimir("Código del cliente:         " + leerCliente());
		imprimir("Código del vendedor:        " + leerVendedor());
		imprimir("Código del producto:        " + leerProducto());
		imprimir("Descripción del producto:   " + descripcion());
		imprimir("Precio unitario:            S/. " + precio());
		imprimir("Importe subtotal:           S/. " + importeCompra());
		imprimir("Importe IGV:                S/. " + importeCompra() * 0.18);
		imprimir("Importe total pagar:        S/. " + importeCompra() * 1.18);
	}

	/**
	 * @param e
	 */
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		if (txtCliente.getText().trim().length() == 0 || txtProducto.getText().trim().length() == 0
				|| txtVendedor.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(this, "Rellena todos los campos");
			return;
		}

		if (validarCliente()) {
			Cliente c = Tienda.CLIENTES.buscar(leerCliente());
			txtNombreCliente.setText(c.getNombres() + " " + c.getApellidos());
			txtCliente.setEnabled(false);
			btnCancelar.setEnabled(true);
		} else {
			JOptionPane.showMessageDialog(this, "Codigo de cliente invalido");
			txtCliente.selectAll();
			txtCliente.requestFocus();
			return;
		}

		if (validarProducto()) {
			Producto p = Tienda.PRODUCTOS.buscar(leerProducto());
			txtNombreProducto.setText(p.getDescripcion());
			txtProducto.setEnabled(false);
			btnCancelar.setEnabled(true);
		} else {
			JOptionPane.showMessageDialog(this, "Codigo de producto invalido");
			txtProducto.selectAll();
			txtProducto.requestFocus();
			return;
		}

		if (validarVendedor()) {
			Vendedor v = Tienda.VENDEDORES.buscar(leerVendedor());
			txtNombreVendedor.setText(v.getNombres() + " " + v.getApellidos());
			txtVendedor.setEnabled(false);
			btnCancelar.setEnabled(true);
		} else {
			JOptionPane.showMessageDialog(this, "Codigo de vendedor invalido");
			txtVendedor.requestFocus();
			return;
		}

		if (validarCliente() && validarCliente() && validarProducto()) {
			btnBuscar.setEnabled(false);
			btnVender.setEnabled(true);
			txtCantidad.setEnabled(true);
			txtCantidad.requestFocus();
			btnCancelar.setEnabled(true);
		}
	}

	protected void actionPerformedBtnVender(ActionEvent e) {
		if (txtCantidad.getText().trim().length() != 0) {
			Factura f = new Factura(Tienda.FACTURAS.generarCodigo(), leerProducto(), leerVendedor(), leerCantidad(),
					precio());
			Tienda.FACTURAS.agregar(f);
			mostrarFactura();
			JOptionPane.showMessageDialog(this, "Venta realizada!");
		} else {
			JOptionPane.showMessageDialog(this, "Ingresa una cantidad antes de vender");
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		reiniciarVentana();
	}

	void reiniciarVentana() {
		txtCliente.setText("");
		txtCliente.setEnabled(true);
		txtNombreCliente.setText("");
		txtVendedor.setText("");
		txtVendedor.setEnabled(true);
		txtNombreVendedor.setText("");
		txtProducto.setText("");
		txtProducto.setEnabled(true);
		txtNombreProducto.setText("");
		txtCantidad.setText("");
		txtCantidad.setEnabled(false);
		txtS.setText("");

		btnBuscar.setEnabled(true);
		btnVender.setEnabled(false);
		btnCancelar.setEnabled(false);
	}
}
