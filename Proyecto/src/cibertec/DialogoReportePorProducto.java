package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.TextArea;
import javax.swing.JButton;

public class DialogoReportePorProducto extends JDialog {
	private TextArea txtS;
	private JButton btnListar;

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
	public DialogoReportePorProducto() {
		setTitle("Reporte por producto");
		setBounds(100, 100, 512, 634);
		getContentPane().setLayout(null);
		
		txtS = new TextArea();
		txtS.setBounds(10, 10, 476, 547);
		getContentPane().add(txtS);
		
		btnListar = new JButton("LISTAR\r\n");
		btnListar.setBounds(206, 565, 89, 23);
		getContentPane().add(btnListar);

	}

}
