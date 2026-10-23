package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLServer {

	private Connection c;
	
	public GenericDaoSQLServer() {
		super();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String hostName = "localhost"; //IP DA MÁQUINA DO SERVIDOR
		String dbName = "Mecanica"; //NOME DA DATABASE
		String user = "sa"; //NOME DO USUÁRIO
		String senha = "senha123"; //SENHA DO USUÁRIO
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver"); //REFERÊNCIA DA CLASSE DA LIB DE CONEXÃO
		
		//CONFIGURAÇÃO DA STRING DE CONEXAO COM SQLSERVER		
		c = DriverManager.getConnection(
				String.format(
						"jdbc:jtds:sqlserver://%s:1433;databaseName=%s", 
						hostName, dbName), user, senha);
						
		return c;
	}
}
