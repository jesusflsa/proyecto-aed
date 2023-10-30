package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMantenimiento;
	private JMenuItem mntmClientes;
	private JMenu mnReportes;
	private JMenuItem mntmReporteProductos;
	private JMenu mnVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnMantenimiento);
		
		mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(this);
		
		mntmVendedores = new JMenuItem("Vendedores");
		mntmVendedores.addActionListener(this);
		mntmVendedores.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMantenimiento.add(mntmVendedores);
		mntmClientes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMantenimiento.add(mntmClientes);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(this);
		mntmProductos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMantenimiento.add(mntmProductos);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnVentas.add(mntmVender);
		
		mnReportes = new JMenu("Reportes");
		mnReportes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnReportes);
		
		mntmReporteProductos = new JMenuItem("Reporte general por productos");
		mntmReporteProductos.addActionListener(this);
		mntmReporteProductos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReporteProductos);
		
		mntmReporteVendedores = new JMenuItem("Reporte general por vendedores");
		mntmReporteVendedores.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReporteVendedores);
		
		mntmReportePorVendedor = new JMenuItem("Reporte por vendedor");
		mntmReportePorVendedor.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReportePorVendedor);
		
		mntmReportePorProducto = new JMenuItem("Reporte por producto");
		mntmReportePorProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReportePorProducto);
		
		mntmReportePrecios = new JMenuItem("Reporte de precios");
		mntmReportePrecios.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReportePrecios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	private JMenuItem mntmProductos;
	private JMenuItem mntmVendedores;
	private JMenuItem mntmVender;
	private JMenuItem mntmReporteVendedores;
	private JMenuItem mntmReportePorVendedor;
	private JMenuItem mntmReportePorProducto;
	private JMenuItem mntmReportePrecios;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmVendedores) {
		
		}
		if (e.getSource() == mntmProductos) {
			actionPerformed(e);
		}
		if (e.getSource() == mntmReporteProductos) {
			actionPerformedMntmCons(e);
		}
		if (e.getSource() == mntmClientes) {
			actionPerformed(e);
		}
		
	}
	
	protected void actionPerformedMntmCons(ActionEvent e) {
		//Declarar una variable referencia que permita controlar la caja
		DialogoVender d;
		//Crear la caja de diálogo y asignar el control a las variables
		d = new DialogoVender();
		//Fijar la localización de la caja de diálogo en relación a la ventana de la tienda
		d.setLocationRelativeTo(this);
		//Hacer visible la caja de diálogo
		d.setVisible(true);
	}
	
}
	
	

	



	
		
	


	

	
		
		
		




 