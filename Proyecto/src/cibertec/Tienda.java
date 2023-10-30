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
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
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
		mntmVender.addActionListener(this);
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
		mntmReporteVendedores.addActionListener(this);
		mntmReporteVendedores.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReporteVendedores);

		mntmReportePorVendedor = new JMenuItem("Reporte por vendedor");
		mntmReportePorVendedor.addActionListener(this);
		mntmReportePorVendedor.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReportePorVendedor);

		mntmReportePorProducto = new JMenuItem("Reporte por producto");
		mntmReportePorProducto.addActionListener(this);
		mntmReportePorProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnReportes.add(mntmReportePorProducto);

		mntmReportePrecios = new JMenuItem("Reporte de precios");
		mntmReportePrecios.addActionListener(this);
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
		if (e.getSource() == mntmReportePrecios) {
			actionPerformedMntmReportePrecios(e);
		}
		if (e.getSource() == mntmReportePorProducto) {
			actionPerformedMntmReportePorProducto(e);
		}
		if (e.getSource() == mntmReportePorVendedor) {
			actionPerformedMntmReportePorVendedor(e);
		}
		if (e.getSource() == mntmReporteVendedores) {
			actionPerformedMntmReporteVendedores(e);
		}
		if (e.getSource() == mntmReporteProductos) {
			actionPerformedMntmReporteProductos(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmProductos) {
			actionPerformedMntmProductos(e);
		}
		if (e.getSource() == mntmClientes) {
			actionPerformedMntmClientes(e);
		}
		if (e.getSource() == mntmVendedores) {
			actionPerformedMntmVendedores(e);
		}
	}

	protected void actionPerformedMntmVendedores(ActionEvent e) {
		DialogoVendedores d = new DialogoVendedores();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmClientes(ActionEvent e) {
		DialogoClientes d = new DialogoClientes();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmProductos(ActionEvent e) {
		DialogoProductos d = new DialogoProductos();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender d = new DialogoVender();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReporteProductos(ActionEvent e) {
		DialogoReporteGeneralProductos d = new DialogoReporteGeneralProductos();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReporteVendedores(ActionEvent e) {
		DialogoReportePorVendedor d = new DialogoReportePorVendedor();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePorVendedor(ActionEvent e) {
		DialogoReportePorVendedor d = new DialogoReportePorVendedor();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePorProducto(ActionEvent e) {
		DialogoReporteGeneralProductos d = new DialogoReporteGeneralProductos();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePrecios(ActionEvent e) {
		DialogoReportePrecios d = new DialogoReportePrecios();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}
}
