package ecole.ensa.projet.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMySQLConnection 
{
	private static JDBCMySQLConnection instance = new JDBCMySQLConnection();
	public static final String URL = "jdbc:mysql://localhost/clientGApp";
	public static final String USER = "root";
	public static final String PASSWORD = "DemoSQL000";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
	public static Connection connection = null;
	
	public JDBCMySQLConnection() 
	{
		try 
		{
			Class.forName(DRIVER_CLASS);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() 
	{
		
		try 
		{
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("test connextion");
		} 
		catch (SQLException e) 
		{
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}	
	
	public static Connection getConnection() 
	{
		return instance.createConnection();
	}
}


