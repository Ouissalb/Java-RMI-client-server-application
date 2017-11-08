package ecole.ensa.projet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ecole.ensa.projet.model.Article;

public class ArticleDao implements IArticleDao{

	static Connection connexion = null;
	static Statement statement = null; 
	static ResultSet rs = null;
	
	@Override
	public Article ajouterArticle(String composition, String usernameG, String nom, String prix, String type) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO ARTICLE	"
				+ "(NOM,"
				+ " PRIX,"
				+ " TYPE,"
				+ " USERNAME_G,"
				+ " COMPOSITION)"
				+ " VALUES "
				+ "(\"" +
				nom+"\", \"" +
				prix+"\" , \"" +
				type +"\", \"" +
				usernameG +"\", \"" +
				composition +"\");";

				System.out.println(query);
				
				try {
					connexion = JDBCMySQLConnection.getConnection();
					statement = connexion.createStatement();
					statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
					Article article = new Article(nom, prix, type, composition);
					return article;
					
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

	@Override
	public Article afficherArticle(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Article> getAll()
	{
	    String query = "SELECT * FROM ARTICLE;";
        ResultSet resultSet = null;
        Article article ;
        ArrayList<Article> the_array = new ArrayList<Article>();
        
                try {
                    connexion = JDBCMySQLConnection.getConnection();
                    statement = connexion.createStatement();
                    resultSet = statement.executeQuery( query );

                    System.out.println( "nom : " );

                    while ( resultSet.next() ) {
                        article = map( resultSet );
                        the_array.add( article );
                        System.out.println( "nom : "  + article.getNom() );
                    }

                    System.out.println( "nom : qsdf" );

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
                return the_array;
	}
	
	public Article map(ResultSet resultSet) throws SQLException
	{
	    Article article = new Article(resultSet.getString( "NOM" ), String.valueOf( resultSet.getInt( "PRIX" )), resultSet.getString( "TYPE" ) , resultSet.getString( "COMPOSITION" ));
	    return article;
	}
	
	public ArrayList<Article> getAll(int min , int max)
	{
	    String query = "SELECT * FROM ARTICLE WHERE PRIX BETWEEN '" + min + "' AND '" + max +"'";
        ResultSet resultSet = null;
        Article article ;
        ArrayList<Article> the_array = new ArrayList<Article>();
        System.out.println(query);
                try {
                    connexion = JDBCMySQLConnection.getConnection();
                    statement = connexion.createStatement();
                    resultSet = statement.executeQuery( query );

                    System.out.println( "nom : " );

                    while ( resultSet.next() ) {
                        article = map( resultSet );
                        the_array.add( article );
                        System.out.println( "nom : "  + article.getNom() );
                    }

                    System.out.println( "nom : qsdf" );

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
                return the_array;
	}

}

