package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoReportePorVendedor extends JDialog {
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
					DialogoReportePorVendedor dialog = new DialogoReportePorVendedor();
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
	public DialogoReportePorVendedor() {
		setTitle("Reporte por vendedor");
		setBounds(100, 100, 510, 634);
		getContentPane().setLayout(null);
		
		txtS = new TextArea();
		txtS.setBounds(10, 10, 474, 541);
		getContentPane().add(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setBounds(206, 561, 89, 23);
		getContentPane().add(btnListar);

	}

}
