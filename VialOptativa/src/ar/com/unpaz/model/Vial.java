package ar.com.unpaz.model;

public class Vial {
	private String id;
	private String red;
	private String nroRed;
	private String camino;
	private String nroCamino;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	public String getNroRed() {
		return nroRed;
	}
	public void setNroRed(String nroRed) {
		this.nroRed = nroRed;
	}
	public String getCamino() {
		return camino;
	}
	public void setCamino(String camino) {
		this.camino = camino;
	}
	public String getNroCamino() {
		return nroCamino;
	}
	public void setNroCamino(String nroCamino) {
		this.nroCamino = nroCamino;
	}
	@Override
	public String toString() {
		return "Vial [id=" + id + ", red=" + red + ", nroRed=" + nroRed + ", camino=" + camino + ", nroCamino="
				+ nroCamino + "]";
	}
	
	
	
	
}
