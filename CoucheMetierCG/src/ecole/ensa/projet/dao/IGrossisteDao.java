package ecole.ensa.projet.dao;

import java.rmi.RemoteException;
import java.util.ArrayList;

import ecole.ensa.projet.model.Grossiste;

public interface IGrossisteDao {
	
	Grossiste checkGrossisteLogin(String username, String password);

	Grossiste ajouterAuCercle(String username, String password, String nom, String coordonnees);
	Grossiste getAll(String username) ;
}
