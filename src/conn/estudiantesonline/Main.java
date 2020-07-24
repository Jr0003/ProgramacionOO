package conn.estudiantesonline;

import com.cursoDAO.Cursos_estudianteDAOImpl;

import conn.entidades.Cursos_estudiante;
import conn.interfa.Cursos_estudiantesDAAO;

public class Main {
	  static String URL = "jdbc:postgresql://localhost:5432/clases_online";
	 static String USUARIO = "postgres";
	 static String CLAVE = "1234";
	
  
	  public static void main(String[] args) {
		  
		  Cursos_estudiantesDAAO cursoDAO = new Cursos_estudianteDAOImpl(); 
		  Cursos_estudiante estudiante =  new Cursos_estudiante(0,3,1);
		  cursoDAO.ingresar(estudiante);
          System.out.println("listo");		  
		  
		  
		  //no hagas nada espera xdd
		  //EstudianteDAO estudianteDAO = new EstudianteDAOImpl();
		  //Estudiante estudiante = new Estudiante(0, "joel", "olivos", "joelolivos@gmail.com");       
		  //estudianteDAO.ingresar(estudiante);		 
		  //List<Estudiante> Estudiante = estudianteDAO.getEstudiante(); 
          //System.out.println(Estudiante);
		  
		  
		  
            // CursosDAO cursoDAO = new CursoDAOImpl();
             //List<Cursos> cursos = cursoDAO.getCursos(); 
             //System.out.println(cursos);
            
             
           // cursoDAO.ingresar(curso);
             //cursoDAO.eliminar(1);
             
             // Cursos curso = new Cursos(5, "Fisica");
              //cursoDAO.actualizar(curso);
             //cursos= cursoDAO.getCursos();
             //System.out.println(cursos.size());
             
          
		  
		  
		  
		  
	
	}

}
