package ar.com.unpaz.model;

public class Informe {
	private String id;
	private String idCliente;
	private int cantidadDeVentasCliente;
	private int totalDeVentasCliente;
	
	
	
	public Informe(String id, String idCliente, int cantidadDeVentasCliente, int totalDeVentasCliente) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.cantidadDeVentasCliente = cantidadDeVentasCliente;
		this.totalDeVentasCliente = totalDeVentasCliente;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getCantidadDeVentasCliente() {
		return cantidadDeVentasCliente;
	}
	public void setCantidadDeVentasCliente(int cantidadDeVentasCliente) {
		this.cantidadDeVentasCliente = cantidadDeVentasCliente;
	}
	public int getTotalDeVentasCliente() {
		return totalDeVentasCliente;
	}
	public void setTotalDeVentasCliente(int totalDeVentasCliente) {
		this.totalDeVentasCliente = totalDeVentasCliente;
	}
	@Override
	public String toString() {
		return "Informe [id=" + id + ", idCliente=" + idCliente + ", cantidadDeVentasCliente=" + cantidadDeVentasCliente
				+ ", totalDeVentasCliente=" + totalDeVentasCliente + "]";
	}
	
	
}
