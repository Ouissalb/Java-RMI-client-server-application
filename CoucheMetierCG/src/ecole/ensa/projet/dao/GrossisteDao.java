package ecole.ensa.projet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ecole.ensa.projet.model.Grossiste;

public class GrossisteDao implements IGrossisteDao 
{

	static Connection connexion = null;
	static Statement statement = null; 
	static ResultSet rs = null;
	
	@Override
	public Grossiste checkGrossisteLogin(String username, String password) 
	{

		Statement stmt = null;
		String nom = "";
		String coordonnees = "";

		String searchQuery = "select * from GROSSISTE "
							+ "where USERNAME='" + username 
							+ "' AND PASSWORD='" + password
							+ "'";
		System.out.println("login : " + username);
		System.out.println("password : " + password); 
		System.out.println("Query: "+searchQuery); 
		try 
		{ //connect to DB 
			connexion = JDBCMySQLConnection.getConnection();
			stmt=connexion.createStatement(); 
			rs = stmt.executeQuery(searchQuery); 
			System.out.println(rs.toString());
			if (!rs.next()) 
			{ 
				System.out.println("erreur, user invalid");
				return null;
			} 
			else
			{ 
				
				nom = rs.getString("NOM");
				coordonnees = rs.getString("COORDONNEES");
				Grossiste grossiste = new Grossiste(username, password, nom, coordonnees);
				return grossiste;
	
			} 
		}
		catch (Exception ex) 
		{ 
			System.out.println("Log In failed: An Exception has occurred! " + ex); 
		} 
			finally 
			{ 
				if (rs != null) 
				{
					try 
					{
						rs.close(); 
					} catch (Exception e) {}
					rs = null; 
				}
				if (stmt != null) 
				{ 
					try 
					{
						stmt.close();
					} 
					catch (Exception e) {} 
					stmt = null; 
				}
				if (connexion != null) 
				{ 
					try 
					{ 
						connexion.close(); 
					} catch (Exception e)
					{ } 
					connexion = null; 
					} 
				}
		return null;
	}

	@Override
	public Grossiste ajouterAuCercle(String username, String password, String nom, String coordonnees) {
		String query = "INSERT INTO GROSSISTE "
				+ "(USERNAME,"
				+ " PASSWORD,"
				+ " NOM,"
				+ " COORDONNEES)"
				+ " VALUES "
				+ "(\"" +
				username +"\", \"" +
				password+"\" , \"" +
				nom +"\", \"" +
				coordonnees+"\");";

				System.out.println(query);
				
				try {
					connexion = JDBCMySQLConnection.getConnection();
					statement = connexion.createStatement();
					int b = statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
					Grossiste grossiste = new Grossiste(username, password, nom, coordonnees);
					return grossiste;
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if (connexion != null) {
						try {
							connexion.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				return null;
	}
}
