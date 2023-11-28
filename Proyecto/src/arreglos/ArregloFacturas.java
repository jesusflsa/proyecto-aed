package arreglos;

import java.util.ArrayList;

import clases.Factura;
import clases.Producto;
import clases.Vendedor;

public class ArregloFacturas {
	private ArrayList<Factura> arreglo;

	public ArregloFacturas() {
		arreglo = new ArrayList<Factura>();
	}

	public Factura obtener(int posicion) {
		return arreglo.get(posicion);
	}

	public Factura buscar(int codigo) {
		for (Factura fac : arreglo) {
			if (fac.getCodVendedor() == codigo)
				return fac;
		}

		return null;
	}

//	Producto
	public ArrayList<Factura> buscarPorProducto(int codigo) {
		ArrayList<Factura> arr = new ArrayList<Factura>();
		for (Factura fac : arreglo) {
			if (fac.getCodProducto() == codigo)
				arr.add(fac);
		}
		if (arr.size() != 0)
			return arr;
		else
			return null;
	}

	public int numeroVentasProd(Producto p) {
		ArrayList<Factura> arr = buscarPorProducto(p.getCodigo());
		if (arr != null) {
			return arr.size();
		} else {
			return 0;
		}
	}

	public int cantidadVendidasProd(Producto p) {
		int c = 0;
		ArrayList<Factura> arr = buscarPorProducto(p.getCodigo());
		if (arr != null) {
			for (Factura f : arr) {
				c += f.getUnidades();
			}
		}
		return c;
	}

	public double importeAcumuladoProd(Producto p) {
		double total = 0;
		ArrayList<Factura> arr = buscarPorProducto(p.getCodigo());
		if (arr != null) {
			for (Factura f : arr) {
				double subtotal = f.getPrecio() * f.getUnidades();
				total += subtotal * 1.18;
			}
		}
		return total;
	}

	// Vendedor

	public ArrayList<Factura> buscarPorVendedor(int codigo) {
		ArrayList<Factura> arr = new ArrayList<Factura>();
		for (Factura fac : arreglo) {
			if (fac.getCodVendedor() == codigo)
				arr.add(fac);
		}
		if (arr.size() != 0)
			return arr;
		else
			return null;
	}

	public int numeroVentasVen(Vendedor v) {
		ArrayList<Factura> arr = buscarPorVendedor(v.getCodigo());
		if (arr != null) {
			return arr.size();
		} else {
			return 0;
		}
	}

	public int cantidadVendidasVen(Vendedor v) {
		int c = 0;
		ArrayList<Factura> arr = buscarPorVendedor(v.getCodigo());
		if (arr != null) {
			for (Factura f : arr) {
				c += f.getUnidades();
			}
		}
		return c;
	}

	public double importeAcumuladoVen(Vendedor v) {
		double total = 0;
		ArrayList<Factura> arr = buscarPorVendedor(v.getCodigo());
		if (arr != null) {
			for (Factura f : arr) {
				double subtotal = f.getPrecio() * f.getUnidades();
				total += subtotal * 1.18;
			}
		}
		return total;
	}

	public void agregar(Factura f) {
		arreglo.add(f);
	}

	public void eliminar(Factura f) {
		arreglo.remove(f);
	}

	public int generarCodigo() {
		if (arreglo.size() == 0)
			return 4001;
		return obtener(tamaño() - 1).getCodFactura() + 1;
	}

	public int tamaño() {
		return arreglo.size();
	}
}
