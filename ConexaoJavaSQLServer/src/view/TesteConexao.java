package view;

import java.sql.Connection;
import java.sql.SQLException;
import persistence.GenericDaoSQLServer;

public class TesteConexao {

	public static void main(String[] args) {
		GenericDaoSQLServer gDaoSQLServer = new GenericDaoSQLServer();
		
		try {
			Connection c = gDaoSQLServer.getConnection();
			String sgbd = c.getMetaData().getDatabaseProductName();
			System.out.println(sgbd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}