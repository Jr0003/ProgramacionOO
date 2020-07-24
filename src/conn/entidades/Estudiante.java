package conn.entidades;


import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private int id;
	private String nombre;
	private String apellidos;
	private String emil;
	
	private List<Cursos> cursos = new ArrayList<>();
	
	
	
	public Estudiante(int id, String nombre, String apellidos, String emil) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.emil = emil;
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


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmil() {
		return emil;
	}


	public void setEmil(String emil) {
		this.emil = emil;
	}
	


	public List<Cursos> getCursos() {
		return cursos;
	}


	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}


	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", emil=" + emil + "]";
	}
	
	
	
	
	

}
