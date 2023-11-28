package cibertec;

import java.awt.EventQueue;

import clases.Cliente;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class DialogoClientes extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JButton btnAgregar;
	private JButton btnNuevo;
	private JButton btnCancelar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnListar;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtCodigo;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JButton btnConsultar;
	private DefaultTableModel modelo;
	private JTable tblTabla;

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
					DialogoClientes dialog = new DialogoClientes();
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
	public DialogoClientes() {
		setTitle("Clientes");
		setBounds(100, 100, 698, 442);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 57, 23);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(10, 38, 81, 14);
		getContentPane().add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 63, 81, 19);
		getContentPane().add(lblApellidos);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 88, 81, 14);
		getContentPane().add(lblTelefono);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(10, 113, 67, 14);
		getContentPane().add(lblDni);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAgregar.setBounds(549, 13, 98, 23);
		getContentPane().add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificar.setBounds(437, 47, 91, 26);
		getContentPane().add(btnModificar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnListar.setBounds(437, 81, 91, 26);
		getContentPane().add(btnListar);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtApellidos.setBounds(101, 62, 209, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombres.setColumns(10);
		txtNombres.setBounds(101, 37, 209, 20);
		getContentPane().add(txtNombres);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("1001");
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(101, 10, 108, 20);
		getContentPane().add(txtCodigo);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(101, 85, 209, 20);
		getContentPane().add(txtTelefono);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDNI.setColumns(10);
		txtDNI.setBounds(101, 110, 209, 20);
		getContentPane().add(txtDNI);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultar.setBounds(219, 9, 91, 23);
		getContentPane().add(btnConsultar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 173, 636, 219);
		getContentPane().add(scrollPane);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Teléfono");
		modelo.addColumn("DNI");
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		tblTabla.setModel(modelo);
		
		 btnEliminar = new JButton("Eliminar");
	     btnEliminar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                actionPerformedBtnEliminar(e);
	            }
	     });
	     btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     btnEliminar.setBounds(549, 47, 98, 26);
	     getContentPane().add(btnEliminar);
		
		 btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
	     btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	     btnCancelar.setBounds(549, 81, 98, 26);
	     getContentPane().add(btnCancelar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(this);
        btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNuevo.setBounds(437, 13, 91, 23);
        getContentPane().add(btnNuevo);

		iniciarVentana();

	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEliminar) {
            actionPerformedBtnEliminar(e);
        }
        if (e.getSource() == btnListar) {
            actionPerformedBtnListar(e);
        }
        if (e.getSource() == btnModificar) {
            actionPerformedBtnModificar(e);
        }
        if (e.getSource() == btnAgregar) {
            actionPerformedBtnAgregar(e);
        }
        if (e.getSource() == btnCancelar) {
            actionPerformedBtnCancelar(e);
        }
        if (e.getSource() == btnNuevo) {
            actionPerformedBtnNuevo(e);
        }
        if (e.getSource() == btnConsultar) {
            actionPerformedBtnConsultar(e);
        }
    }
	
	public void iniciarVentana() {
		limpiar();
		listar();
		editar(false);
		txtCodigo.setFocusable(true);
		btnModificar.setEnabled(false);
		btnAgregar.setEnabled(false);
		btnEliminar.setEnabled(false);
	}
	
	public void limpiar() {
		txtCodigo.setText("");
		txtCodigo.requestFocusInWindow();
		txtNombres.setText("");
		txtApellidos.setText("");
		txtTelefono.setText("");
		txtDNI.setText("");
	}
	
	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < Tienda.CLIENTES.tamaño(); i++) {
			Cliente c = Tienda.CLIENTES.obtener(i);
			agregarFila(c);
		}
	}
	
	public void agregarFila(Cliente c) {
		Object[] fila = { c.getCodigo(), c.getNombres(), c.getApellidos(), c.getTelefono(), c.getDni() };
		modelo.addRow(fila);
	}
	
	public void mostrarDatos(Cliente c) {
		String nombres = c.getNombres();
		String apellidos = c.getApellidos();
		String telefono = c.getTelefono();
		String dni = c.getDni();

		txtNombres.setText(nombres);
		txtApellidos.setText(apellidos);
		txtTelefono.setText(telefono);
		txtDNI.setText(dni);
	}

	
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		if (txtCodigo.getText().length() != 0) {
			Cliente c = Tienda.CLIENTES.buscar(leerCodigo());
			if (c != null) {
				modelo.setRowCount(0);
				agregarFila(c);
				mostrarDatos(c);

				btnAgregar.setEnabled(false);
				btnNuevo.setEnabled(false);
				btnListar.setEnabled(false);

				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnCancelar.setEnabled(true);

			} else {
				JOptionPane.showMessageDialog(this, "No existe un cliente con ese código",
						"Código no encontrado", JOptionPane.ERROR_MESSAGE);
				txtCodigo.setText("");
				txtCodigo.requestFocusInWindow();
			}
		} else {
			JOptionPane.showMessageDialog(this, "Escribe un codigo para buscar");
		}
	}
	
	public void editar(boolean value) {
		txtCodigo.setEnabled(!value);
		btnConsultar.setEnabled(!value);
		btnListar.setEnabled(!value);
	    btnNuevo.setEnabled(!value);
	   
		btnCancelar.setEnabled(value);
		txtNombres.setEnabled(value);
		txtApellidos.setEnabled(value);
		txtTelefono.setEnabled(value);
		txtDNI.setEnabled(value);
	}
	
	protected void actionPerformedBtnNuevo(ActionEvent e) {
		editar(true);
		btnAgregar.setEnabled(true);
		btnListar.setEnabled(false);
		btnNuevo.setEnabled(false);
		txtCodigo.setText(Tienda.CLIENTES.generarCodigo() + "");
	}
	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		iniciarVentana();
	}
	
	protected void actionPerformedBtnAgregar(ActionEvent e) {

		if (leerNombres().length() != 0 && leerApellidos().length() != 0 && leerTelefono().length() != 0
				&& leerDni().length() != 0) {

			Cliente c = Tienda.CLIENTES.buscar(leerCodigo());
			if (c == null) {
				Cliente cli = new Cliente(leerCodigo(), leerNombres(), leerApellidos(), leerTelefono(), leerDni());
				Tienda.CLIENTES.agregar(cli);
				JOptionPane.showMessageDialog(this, "Cliente creado exitosamente");
			} else {
				c.setCodigo(leerCodigo());
				c.setNombres(leerNombres());
				c.setApellidos(leerApellidos());
				c.setTelefono(leerTelefono());
				c.setDni(leerDni());

				JOptionPane.showMessageDialog(this, "Cliente modificado correctamente");
			}
			iniciarVentana();
		} else {
			JOptionPane.showMessageDialog(this, "Rellena todos los campos");
			if (leerDni().length() == 0)
				txtDNI.requestFocusInWindow();
			if (leerTelefono().length() == 0)
				txtTelefono.requestFocusInWindow();
			if (leerApellidos().length() == 0)
				txtApellidos.requestFocusInWindow();
			if (leerNombres().length() == 0)
				txtNombres.requestFocusInWindow();
		}
	}
	

	protected void actionPerformedBtnModificar(ActionEvent e) {
		editar(true);
		btnModificar.setEnabled(false);
		btnEliminar.setEnabled(false);
		btnAgregar.setEnabled(true);
	}
	
	protected void actionPerformedBtnListar(ActionEvent e) {
		limpiar();
		editar(false);
		listar();
	}
	
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		int dialogResult = JOptionPane.showConfirmDialog(this, "Deseas eliminar el cliente " + leerCodigo() + "?",
				"Eliminar cliente", JOptionPane.YES_NO_OPTION);
		if (dialogResult == 0) {
			Cliente c = Tienda.CLIENTES.buscar(leerCodigo());
			Tienda.CLIENTES.eliminar(c);
			JOptionPane.showMessageDialog(this, "Cliente eliminado");
		}
		iniciarVentana();

	}
	
	public int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}


	public String leerNombres() {
		return txtNombres.getText().trim();
	}

	public String leerApellidos() {
		return txtApellidos.getText().trim();
	}

	public String leerTelefono() {
		return txtTelefono.getText().trim();
	}

	public String leerDni() {
		return txtDNI.getText().trim();
	}

}


