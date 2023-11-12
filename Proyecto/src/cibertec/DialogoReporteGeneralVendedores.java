package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.TextArea;
import javax.swing.JButton;

public class DialogoReporteGeneralVendedores extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextArea txtS;
	private JButton btnListar;

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
	public DialogoReporteGeneralVendedores() {
		setTitle("Reporte general por vendedores:");
		setBounds(100, 100, 555, 632);
		getContentPane().setLayout(null);
		
		txtS = new TextArea();
		txtS.setBounds(10, 10, 519, 545);
		getContentPane().add(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(228, 563, 89, 23);
		getContentPane().add(btnListar);

	}

}
