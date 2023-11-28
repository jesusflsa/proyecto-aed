package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

import clases.Vendedor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialogoReporteGeneralVendedores extends JDialog implements ActionListener {
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
					DialogoReporteGeneralVendedores dialog = new DialogoReporteGeneralVendedores();
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
	public DialogoReporteGeneralVendedores() {
		setTitle("Reporte general por vendedores");
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

	public void mostrarReporte(Vendedor v) {
		imprimir("Código de vendedor           : " + v.getCodigo());
		imprimir("Nombre de vendedor           : " + v.getNombres() + " " + v.getApellidos());
		imprimir("Categoría                    : " + Tienda.VENDEDORES.nombreCategoria(v.getCategoria()));
		imprimir("Número de ventas             : " + Tienda.FACTURAS.numeroVentasVen(v));
		imprimir("Unidades vendidas acumuladas : " + Tienda.FACTURAS.cantidadVendidasVen(v));
		imprimir("Importe total acumulado      : " + Tienda.FACTURAS.importeAcumuladoVen(v));
		imprimir("");
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("");
		for (int i = 0; i < Tienda.VENDEDORES.tamaño(); i++) {
			mostrarReporte(Tienda.VENDEDORES.obtener(i));
		}
	}
}
