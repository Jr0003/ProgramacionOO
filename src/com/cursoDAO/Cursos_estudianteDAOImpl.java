package com.cursoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import conn.entidades.Cursos_estudiante;
import conn.interfa.Cursos_estudiantesDAAO;
import conn.util.Util;

public class Cursos_estudianteDAOImpl implements Cursos_estudiantesDAAO{

	         
		public void ingresar(Cursos_estudiante cur) {
		String query ="INSERT INTO public.cursos_estudiantes(id_cursos, id_estudiantes)VALUES (?, ?)";
			Connection conn;
			try
		       {
			   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
			   		 

				PreparedStatement stm = conn.prepareStatement(query);  
				stm.setInt(1, cur.getCursos_id());
				stm.setInt(2, cur.getEsudiantes_id());
				stm.execute();
				   
			   }
			   	   
		   catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

		

}
