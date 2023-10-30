package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.TextArea;
import javax.swing.JButton;

public class DialogoReporteGeneralProductos extends JDialog {
	private TextArea txtS;
	private JButton btnListar;

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
	public DialogoReporteGeneralProductos() {
		setTitle("Reporte general por productos");
		setBounds(100, 100, 574, 590);
		getContentPane().setLayout(null);
		
		txtS = new TextArea();
		txtS.setBounds(9, 11, 539, 502);
		getContentPane().add(txtS);
		
		btnListar = new JButton("LISTAR\r\n");
		btnListar.setBounds(232, 522, 89, 23);
		getContentPane().add(btnListar);

	}

}
