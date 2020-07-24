package conn.entidades;

public class Cursos_estudiante {
	
	private int id;
	private int cursos_id;
	private int esudiantes_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCursos_id() {
		return cursos_id;
	}
	public void setCursos_id(int cursos_id) {
		this.cursos_id = cursos_id;
	}
	public int getEsudiantes_id() {
		return esudiantes_id;
	}
	public void setEsudiantes_id(int esudiantes_id) {
		this.esudiantes_id = esudiantes_id;
	}
	
	public Cursos_estudiante() {
		
	}
	
	
	public Cursos_estudiante(int id, int cursos_id, int esudiantes_id) {
		super();
		this.id = id;
		this.cursos_id = cursos_id;
		this.esudiantes_id = esudiantes_id;
	}
	
	@Override
	public String toString() {
		return "cursos_estudiantes [id=" + id + ", cursos_id=" + cursos_id + ", esudiantes_id=" + esudiantes_id + "]";
	}
	
	
	
	
	
	

}
