package ecole.ensa.projet.model;

import java.io.Serializable;

public class Grossiste implements Serializable
{

	public Grossiste(String username, String password) {
		// TODO Auto-generated constructor stub
	}
	
	private String nom;
	private String username;
	private String password;
	private String coordonnees;
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String Username)
	{
		this.username = Username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getCoordonnees()
	{
		return coordonnees;
	}
	public void setCoordonnes(String coordonnees)
	{
		this.coordonnees = coordonnees;
	}
	
	
	public Grossiste (String username,  String nom, String coordonnees)
	{
		super();
		this.username = username;
		this.nom = nom;

		this.coordonnees = coordonnees;
		
	}
	
	public Grossiste (String username, String password, String nom, String coordonnees)
	{
		super();
		this.username = username;
		this.nom = nom;
		this.password = password;
		this.coordonnees = coordonnees;
		
	}

}
