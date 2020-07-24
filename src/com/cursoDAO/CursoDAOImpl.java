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
import conn.interfa.CursosDAO;
import conn.util.Util;

public class CursoDAOImpl implements CursosDAO {
	 

	@Override
	public List<Cursos> getCursos() {
		List<Cursos> cursos = new ArrayList<>(); 
		Connection con; 
	        
         try 
       {
           con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
           
           
      
           String sql = "SELECT id, nombre FROM curso";
           PreparedStatement stm = con.prepareStatement(sql);
           ResultSet rs = stm.executeQuery();
           while(rs.next()){
              Cursos curso = new Cursos(rs.getInt(1), rs.getString(2));
              cursos.add(curso) ;        
            }       
           
       }   
         catch (SQLException e) 
         
       {
       	 e.printStackTrace();
       }	
		
		
		
		return cursos;
	}

	@Override
	public void ingresar(Cursos curso) {
      String  query ="INSERT INTO public.curso(nombre)VALUES (?);";
     
		
		
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setString(1, curso.getNombre());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

	@Override
	public void actualizar(Cursos cursos) {
		String query = "UPDATE public.curso SET  nombre=? WHERE id=?;";
		
		 Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setString(1, cursos.getNombre());
			stm.setInt(2, cursos.getId());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
	}

	@Override
	public void eliminar(int id) {
		String query ="DELETE FROM public.curso WHERE id=?;";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, id);
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		e.printStackTrace();
	}
		
	}

	@Override
	public List<Estudiante> getEstudiantesPorCurso(int cursoid) {
		String query ="SELECT curso.id,curso.nombre from public.curso"
				+"inner join  cursos_estudiantes on curso.id = cursos_estudiantes.id_cursos"
				+"where id_estudiantes=?;";
				
				List<Estudiante> estudiantes = new ArrayList<>();
				Connection con; 
			    
			    try 
			  {
			      con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
			      PreparedStatement stm = con.prepareStatement(query);
			      stm.setInt(1,cursoid);
			      ResultSet rs = stm.executeQuery();
			      while(rs.next()){
			   	   Estudiante estudiante = new Estudiante(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4));
			   	   estudiantes.add(estudiante) ;        
			       } 
			  }   
			    catch (SQLException e) {
			   	 e.printStackTrace();
			    }
		return estudiantes;
	}

}
