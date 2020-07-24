package com.cursoDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.entidades.Cursos;
import conn.entidades.Estudiante;
import conn.interfa.EstudianteDAO;
import conn.util.Util;

public class EstudianteDAOImpl implements EstudianteDAO
{
	public List<Estudiante> getEstudiante() {
		List<Estudiante> Estudiante = new ArrayList<>(); 
		Connection con; 
	        
         try 
       {
           con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
           
           
      
           String sql ="SELECT id, nombres, apellidos, email FROM public.estudiante;";
           
           PreparedStatement stm = con.prepareStatement(sql);
           ResultSet rs = stm.executeQuery();
           while(rs.next()){
        	   Estudiante estudiante = new Estudiante(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
        	   Estudiante.add(estudiante) ;        
            }       
           
       }   
         catch (SQLException e) {
        	 e.printStackTrace();
         }
		return Estudiante;
	
	}
	
	
	
	
	
	@Override
	public void ingresar(Estudiante Estudiante) 
	{
		 String  query ="INSERT INTO public.estudiante( nombres, apellidos, email)VALUES (?, ?, ?);";
		 
	     
			
			Connection conn;
			try
		       {
			   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
			   		 

				PreparedStatement stm = conn.prepareStatement(query);  
				stm.setString(1, Estudiante.getNombre());
				stm.setString(2, Estudiante.getApellidos());
				stm.setString(3, Estudiante.getEmil());
				
				stm.execute();
				   
			   }
			   	   
		   catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			

	@Override
	public void actualizar(Estudiante Estudiante) {
		String query = "UPDATE public.estudiante SET nombre=? WHERE id=?;";
		
		 Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setString(1, Estudiante.getNombre());
			stm.setString(2, Estudiante.getApellidos());
			stm.setString(3, Estudiante.getEmil());	
			stm.setInt(4, Estudiante.getId());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

	@Override
	public void eliminar(int id) {
		String query ="DELETE FROM public.estudiante WHERE id=?;";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, id);
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}





	@Override
	public List<Cursos> getCursosPorEstudiante(int estudianteid) {
	String query ="SELECT curso.id,curso.nombre from public.curso"
	+"inner join  cursos_estudiantes on curso.id = cursos_estudiantes.id_cursos"
	+"where id_estudiantes=?;";
	
	List<Cursos> cursos = new ArrayList<>();
	Connection con; 
    
    try 
  {
      con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);   
      PreparedStatement stm = con.prepareStatement(query);
      stm.setInt(1,estudianteid);
      ResultSet rs = stm.executeQuery();
      while(rs.next()){
   	   Cursos curso = new Cursos(rs.getInt(1), rs.getString(2));
   	   cursos.add(curso) ;        
       } 
  }   
    catch (SQLException e) {
   	 e.printStackTrace();
    }
	return cursos;
}
	

	 

}
