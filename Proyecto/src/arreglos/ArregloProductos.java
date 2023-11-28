package arreglos;

import java.util.ArrayList;

import clases.Producto;

public class ArregloProductos {
	private ArrayList<Producto> arreglo;

	public ArregloProductos() {
		arreglo = new ArrayList<Producto>();
	}

	public Producto obtener(int posicion) {
		return arreglo.get(posicion);
	}

	public Producto buscar(int codigo) {
		for (Producto pro : arreglo) {
			if (pro.getCodigo() == codigo)
				return pro;
		}
		return null;
	}

	public void agregar(Producto c) {
		arreglo.add(c);
	}

	public void eliminar(Producto c) {
		arreglo.remove(c);
	}

	public int generarCodigo() {
		if (arreglo.size() == 0)
			return 3001;
		return obtener(tamaño() - 1).getCodigo() + 1;
	}

	public int tamaño() {
		return arreglo.size();
	}
}
