package ecole.ensa.projet.dao;

import ecole.ensa.projet.model.Grossiste;

public interface IGrossisteDao {
	
	Grossiste checkGrossisteLogin(String username, String password);

	Grossiste ajouterAuCercle(String username, String password, String nom, String coordonnees);

}
