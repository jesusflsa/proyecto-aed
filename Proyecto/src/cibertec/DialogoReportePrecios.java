package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

import clases.Producto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialogoReportePrecios extends JDialog implements ActionListener {
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
					DialogoReportePrecios dialog = new DialogoReportePrecios();
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
	public DialogoReportePrecios() {
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
		txtS.setEditable(false);
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

	double calcularPromedio() {
		double promedio = 0;
		for (int i = 0; i < Tienda.PRODUCTOS.tamaño(); i++) {
			promedio += Tienda.PRODUCTOS.obtener(i).getPrecio();
		}
		return promedio / Tienda.PRODUCTOS.tamaño();
	}

	double precioMayor() {
		double mayor = 0;
		for (int i = 0; i < Tienda.PRODUCTOS.tamaño(); i++) {
			Producto p = Tienda.PRODUCTOS.obtener(i);
			if (p.getPrecio() > mayor)
				mayor = p.getPrecio();
		}
		return mayor;
	}

	double precioMenor() {
		double menor = 0;
		for (int i = 0; i < Tienda.PRODUCTOS.tamaño(); i++) {
			Producto p = Tienda.PRODUCTOS.obtener(i);
			if (p.getPrecio() < menor)
				menor = p.getPrecio();
		}
		return menor;
	}

	public void mostrarReporte() {
		txtS.setText("");
		imprimir("Precio promedio : " + calcularPromedio());
		imprimir("Precio mayor    : " + precioMayor());
		imprimir("Precio menor    : " + precioMenor());
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		mostrarReporte();
	}
}
