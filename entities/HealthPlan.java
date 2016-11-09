package entities;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class HealthPlan {
	private String nombre;
	private String telefonoContacto;
	private Double cuotaMensual;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	public Double getCuotaMensual() {
		return cuotaMensual;
	}
	public void setCuotaMensual(Double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	public HealthPlan(String nombre, String telefonoContacto, Double cuotaMensual) {
		super();
		this.nombre = nombre;
		this.telefonoContacto = telefonoContacto;
		this.cuotaMensual = cuotaMensual;
	}
	
}
