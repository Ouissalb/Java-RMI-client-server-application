package ecole.ensa.projet.model;

import java.io.Serializable;

public class Client implements Serializable
{

	//private static final long serialVersionUID = 1L;
	
	private String nom;
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public Client (String nom)
	{
		super();
		this.nom = nom;
	}
}
