package ar.com.unpaz.model;

public class Detalle {
	//id,venta,producto,cantidad,precio
	private String id;
	private String idVenta;
	private String idProducto;
	private int cantidad;
	private int precio;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Detalle [id=" + id + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
