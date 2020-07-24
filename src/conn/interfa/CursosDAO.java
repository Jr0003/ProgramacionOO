package conn.interfa;

import java.util.List;

import conn.entidades.Cursos;
import conn.entidades.Estudiante;

public interface CursosDAO {

	
	public void ingresar(Cursos cursos);
	public void actualizar(Cursos cursos);
	public void eliminar(int id);
	List<Cursos> getCursos();
	List<Estudiante>getEstudiantesPorCurso(int cursoid);
	
	
	
	
	
}
