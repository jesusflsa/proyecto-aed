package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.ArregloCliente;
import arreglos.ArregloFacturas;
import arreglos.ArregloProductos;
import arreglos.ArregloVendedores;
import clases.Cliente;
import clases.Producto;
import clases.Vendedor;

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

	private JMenuItem mntmProductos;
	private JMenuItem mntmVendedores;
	private JMenuItem mntmVender;
	private JMenuItem mntmReporteVendedores;
	private JMenuItem mntmReportePorVendedor;
	private JMenuItem mntmReportePorProducto;
	private JMenuItem mntmReportePrecios;

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

	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnMantenimiento);

		mntmClientes = new JMenuItem("Mantenimiento de clientes");
		mntmClientes.addActionListener(this);

		mntmVendedores = new JMenuItem("Mantenimiento de vendedores");
		mntmVendedores.addActionListener(this);
		mntmVendedores.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMantenimiento.add(mntmVendedores);
		mntmClientes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMantenimiento.add(mntmClientes);

		mntmProductos = new JMenuItem("Mantenimiento de productos");
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

		generarDatos();
	}

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

	public static ArregloVendedores VENDEDORES = new ArregloVendedores();
	public static ArregloCliente CLIENTES = new ArregloCliente();
	public static ArregloProductos PRODUCTOS = new ArregloProductos();
	public static ArregloFacturas FACTURAS = new ArregloFacturas();

	protected void actionPerformedMntmVendedores(ActionEvent e) {
		DialogoVendedores d = new DialogoVendedores();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	public void generarDatos() {
		CLIENTES.agregar(new Cliente(1001, "Alejandro", "González", "92143657", "21436587"));
        CLIENTES.agregar(new Cliente(1002, "Marina", "López", "97654321", "76543210"));
        CLIENTES.agregar(new Cliente(1003, "Diego", "Hernández", "91987654", "19876543"));
        CLIENTES.agregar(new Cliente(1004, "Catalina", "Rojas", "98765432", "87654321"));
        CLIENTES.agregar(new Cliente(1005, "Gabriel", "Mendoza", "94321876", "43218765"));
        CLIENTES.agregar(new Cliente(1006, "Isabel", "Vargas", "98901234", "89012345"));
        CLIENTES.agregar(new Cliente(1007, "Santiago", "Ramírez", "93456789", "34567890"));
        CLIENTES.agregar(new Cliente(1008, "Valentina", "Pérez", "91098765", "10987654"));
		
		VENDEDORES.agregar(new Vendedor(2001, 0, "Emma", "Richetti", "95271346", "51472983"));
		VENDEDORES.agregar(new Vendedor(2002, 2, "Jessica", "Cicchini", "96432189", "82734156"));
		VENDEDORES.agregar(new Vendedor(2003, 3, "Carlos", "Gómez", "99812345", "63984721"));
		VENDEDORES.agregar(new Vendedor(2004, 4, "Fernanda", "Huamán", "97543201", "92817645"));
		VENDEDORES.agregar(new Vendedor(2005, 2, "Pedro", "Ramírez", "94368972", "47582913"));
		VENDEDORES.agregar(new Vendedor(2006, 3, "Ana", "Sánchez", "98921765", "36219874"));
		VENDEDORES.agregar(new Vendedor(2007, 4, "Miguel", "Torres", "93450621", "84156239"));
		VENDEDORES.agregar(new Vendedor(2008, 2, "Elena", "Fernández", "92198347", "75329814"));

		PRODUCTOS.agregar(new Producto(3001, "Auriculares Inalámbricos con Cancelación de Ruido", 150.00));
		PRODUCTOS.agregar(new Producto(3002, "Cámara de Seguridad Inteligente", 80.00));
		PRODUCTOS.agregar(new Producto(3003, "Bicicleta Eléctrica Plegable", 900.00));
		PRODUCTOS.agregar(new Producto(3004, "Kit de Herramientas para Reparación de Dispositivos Electrónicos", 30.00));
		PRODUCTOS.agregar(new Producto(3005, "Smartwatch con Monitor de Actividad", 180.00));
		PRODUCTOS.agregar(new Producto(3006, "Teclado Mecánico para Gaming", 80.00));
		PRODUCTOS.agregar(new Producto(3007, "Impresora Multifuncional Inalámbrica", 200.00));
		PRODUCTOS.agregar(new Producto(3008, "Mochila Antirrobo con Puerto USB", 50.00));
		PRODUCTOS.agregar(new Producto(3019, "Altavoces Bluetooth Impermeables", 70.00));
		PRODUCTOS.agregar(new Producto(3010, "Monitor Curvo de Alta Resolución", 350.00));
		PRODUCTOS.agregar(new Producto(3011, "Cargador Inalámbrico Rápido", 25.00));
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
		DialogoReporteGeneralVendedores d = new DialogoReporteGeneralVendedores();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePorVendedor(ActionEvent e) {
		DialogoReportePorVendedor d = new DialogoReportePorVendedor();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePorProducto(ActionEvent e) {
		DialogoReportePorProducto d = new DialogoReportePorProducto();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmReportePrecios(ActionEvent e) {
		DialogoReportePrecios d = new DialogoReportePrecios();
		d.setVisible(true);
		d.setLocationRelativeTo(this);
	}
}