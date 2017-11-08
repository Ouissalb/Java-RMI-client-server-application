package ecole.ensa.projet.model;

import java.io.Serializable;

public class Article implements Serializable
{
	
	private String nom;
	private String prix;
	private String type;
	private String composition;
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getPrix()
	{
		return prix;
	}
	public void setPrix(String prix)
	{
		this.prix = prix;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getComposition()
	{
		return composition;
	}
	public void setComposition(String composition)
	{
		this.composition = composition;
	}
	
	public Article (String nom, String prix, String type, String composition)
	{
		super();
		this.prix = prix;
		this.nom = nom;
		this.type = type;
		this.composition = composition;
		
	}


}
