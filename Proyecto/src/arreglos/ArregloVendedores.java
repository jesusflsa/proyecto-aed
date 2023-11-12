package arreglos;

import java.util.ArrayList;

import clases.Vendedor;

public class ArregloVendedores {
	private ArrayList<Vendedor> arreglo;

	public ArregloVendedores() {
		arreglo = new ArrayList<Vendedor>();
	}

	public Vendedor obtener(int posicion) {
		return arreglo.get(posicion);
	}

	public Vendedor buscar(int codigo) {
		for (Vendedor ven : arreglo) {
			if (ven.getCodigo() == codigo)
				return ven;
		}
		return null;
	}

	public void agregar(Vendedor v) {
		arreglo.add(v);
	}

	public void eliminar(Vendedor v) {
		arreglo.remove(v);
	}

	public int generarCodigo() {
		if (arreglo.size() == 0)
			return 2001;
		return obtener(tamaño() - 1).getCodigo() + 1;
	}

	public int tamaño() {
		return arreglo.size();
	}
}
