package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

import clases.Producto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialogoReporteGeneralProductos extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoReporteGeneralProductos dialog = new DialogoReporteGeneralProductos();
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
	public DialogoReporteGeneralProductos() {
		setTitle("Reporte general por productos");
		setBounds(100, 100, 574, 590);
		getContentPane().setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(232, 522, 89, 23);
		getContentPane().add(btnListar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 538, 497);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}

	public void imprimir(String str) {
		txtS.append(str + "\n");
	}

	public void mostrarReporte(Producto p) {
		imprimir("Codigo de producto           : " + p.getCodigo());
		imprimir("Producto                     : " + p.getDescripcion());
		imprimir("Número de ventas             : " + Tienda.FACTURAS.numeroVentasProd(p));
		imprimir("Unidades vendidas acumuladas : " + Tienda.FACTURAS.cantidadVendidasProd(p));
		imprimir("Importe total acumulado      : " + Tienda.FACTURAS.importeAcumuladoProd(p));
		imprimir("");
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("");
		for (int i = 0; i < Tienda.PRODUCTOS.tamaño(); i++) {
			mostrarReporte(Tienda.PRODUCTOS.obtener(i));
		}
	}
}
