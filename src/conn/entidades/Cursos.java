package conn.entidades;


import java.util.ArrayList;
import java.util.List;

public class Cursos {
     private int id;
     private String nombre;
     
     private List<Estudiante> estudiante = new ArrayList<>();
	
     public Cursos()
     { 
    	 
     }
     
     public Cursos(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
     

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(List<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Cursos [id=" + id + ", nombre=" + nombre + "]";
	}
     
     
	
	
}
