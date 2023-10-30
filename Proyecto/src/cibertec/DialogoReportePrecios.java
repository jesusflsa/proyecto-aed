package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.TextArea;
import javax.swing.JButton;

public class DialogoReportePrecios extends JDialog {
	private TextArea txtS;
	private JButton btnListar;

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
	public DialogoReportePrecios() {
		setTitle("Reporte de precios");
		setBounds(100, 100, 510, 632);
		getContentPane().setLayout(null);
		
		txtS = new TextArea();
		txtS.setBounds(10, 10, 474, 543);
		getContentPane().add(txtS);
		
		btnListar = new JButton("LISTAR\r\n");
		btnListar.setBounds(205, 559, 89, 23);
		getContentPane().add(btnListar);

	}

}
