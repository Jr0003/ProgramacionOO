package conn.interfa;

import java.util.List;

import conn.entidades.Cursos;
import conn.entidades.Estudiante;
public interface EstudianteDAO 
{
	
	public void ingresar(Estudiante Estudiante);
	public void actualizar(Estudiante Estudiante);
	public void eliminar(int id);
	List<Cursos> getCursosPorEstudiante(int estudianteid);
	List<Estudiante>getEstudiante();

}
