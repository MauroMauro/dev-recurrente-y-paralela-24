package ar.com.unpaz.model;

public class Venta {
	private String id;
	private String fecha;
	private String IdCliente;
	private String Total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "Venta [id=" + id + ", fecha=" + fecha + ", IdCliente=" + IdCliente + ", Total=" + Total + "]";
	}
	
	
	
}
