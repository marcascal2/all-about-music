package aiss.model.api;

public class Lugar {
	private String nombre;
	private String id;
	private Double lat;
	private Double lon;
	private String direccion;
	private Integer codigoPostal;
	
	public Lugar() {
		
	}

	public Lugar(String nombre, String id, Double lat, Double lon, String direccion, Integer codigoPostal) {
		this.nombre = nombre;
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Double getLat() {
		return lat;
	}
	
	public void setLat(Double lat) {
		this.lat = lat;
	}
	
	public Double  getLon() {
		return lon;
	}
	
	public void setLon(Double lon) {
		this.lon = lon;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", direccion=" + direccion + ", id=" + id + "]";
	}

}