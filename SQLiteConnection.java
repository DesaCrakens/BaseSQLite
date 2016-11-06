package pck_db;

import java.sql.*;
import javax.swing.*;

public class SQLiteConnection {
	private Connection conn = null;
	
	public static Connection dbConnector(){ //va a devolver la conexión
		Connection conn = null;
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Daiana\\Documents\\UnLaM\\Programación Avanzada\\PruebaBD\\BDPrueba.sqlite");
			//BORRAR
			//JOptionPane.showMessageDialog(null,"Conexión exitosa"); //se supone que debería mostrar el error
			//BORRAR
			return conn;
		}catch(Exception e){
			 JOptionPane.showMessageDialog(null,e); //se supone que debería mostrar el error
			 return null;
		}
	}
}
