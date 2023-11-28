package clases;

public class Factura {
	private int codFactura;
	private int codProducto;
	private int codVendedor;
	private int unidades;
	private double precio;

	public Factura(int codFactura, int codProducto, int codVendedor, int unidades, double precio) {
		this.codFactura = codFactura;
		this.codProducto = codProducto;
		this.codVendedor = codVendedor;
		this.unidades = unidades;
		this.precio = precio;
	}

	public int getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(int codFactura) {
		this.codFactura = codFactura;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
