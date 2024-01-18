package modelo;

public class AccesoUsuario {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	
	//****** Constructor
	public AccesoUsuario() {
	}

	//*******Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//*****toString
	@Override
	public String toString() {
		return "AccesoUsuario [id=" + id + ", nombre=" + nombre + "]";
	}

	//**** Métodos
	public boolean equals(Object object) {
		if (!(object instanceof AccesoUsuario)) {
			return false;
		}
		
		AccesoUsuario otroUsuario = (AccesoUsuario) object;
		if((this.id == null && otroUsuario.id !=null)||
			(this.id != null && !this.id.equals(otroUsuario.id)) ||
			(this.nombre == null && otroUsuario.nombre !=null) ||
			(this.nombre != null && !this.nombre.equals(otroUsuario.nombre))){
			return false;
		}
		
		return true;
		
	}
	
	public int hashCode() {
		int hash = 0;
		hash += (id !=null ? id.hashCode():0);
		return hash;
	}

}
