package ExamenPracticaGame;

import java.util.ArrayList;

public class Venta {
	private Empleado emple;
	private String fecha_venta;
	private Tienda tienda;
	private Cliente cliente;
	private ArrayList<Linea_venta> lineas_venta;
	
	public Empleado getEmple() {
		return emple;
	}
	public void setEmple(Empleado emple) {
		this.emple = emple;
	}
	public String getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Linea_venta> getLineas_venta() {
		return lineas_venta;
	}
	public void setLineas_venta(ArrayList<Linea_venta> lineas_venta) {
		this.lineas_venta = lineas_venta;
	}
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Venta(Empleado emple, String fecha_venta, double importe_total_venta, Tienda tienda, Cliente cliente,
			ArrayList<Linea_venta> lineas_venta) {
		super();
		this.emple = emple;
		this.fecha_venta = fecha_venta;
		this.tienda = tienda;
		this.cliente = cliente;
		this.lineas_venta = lineas_venta;
	}
	
	public double importeTotal() {
		var importeTotal= 0.0;
		for (Linea_venta linea_venta : lineas_venta) {
			importeTotal+= linea_venta.getImporte();
		}
		return importeTotal;
	}
	
}
	
