package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import clases.Factura;
import clases.Producto;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoReportePorProducto extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoReportePorProducto dialog = new DialogoReportePorProducto();
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
	public DialogoReportePorProducto() {
		setTitle("Reporte por Producto");
		setBounds(100, 100, 698, 442);
		getContentPane().setLayout(null);

		lblCodigo = new JLabel("Código");
		lblCodigo.setBounds(10, 20, 60, 14);
		getContentPane().add(lblCodigo);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(80, 17, 86, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(583, 16, 89, 23);
		getContentPane().add(btnBuscar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 662, 332);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}

	void imprimir(String str) {
		txtS.append(str + "\n");
	}

	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}

	void mostrarReporte(Factura f) {
		imprimir("Código de factura  : " + f.getCodFactura());
		imprimir("Código de producto : " + f.getCodProducto());
		imprimir("Unidades vendidas  : " + f.getUnidades());
		imprimir("Precio unitario    : S/." + f.getPrecio());
		imprimir("");
	}

	protected void actionPerformedBtnBuscar(ActionEvent e) {
		if (leerCodigo() > 3000 && leerCodigo() < 4000) {
			txtS.setText("");
			Producto p = Tienda.PRODUCTOS.buscar(leerCodigo());
			if (p != null) {
				if (Tienda.FACTURAS.buscarPorProducto(leerCodigo()) != null) {
					for (Factura f : Tienda.FACTURAS.buscarPorProducto(leerCodigo())) {
						mostrarReporte(f);
					}
				} else {
					imprimir(Tienda.PRODUCTOS.buscar(leerCodigo()).getDescripcion() + " no se ha vendido ninguna vez");
				}
			} else {
				imprimir("No existe un producto con ese codigo");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Ingresa un codigo valido\nA partir del 3001");
		}
	}
}
