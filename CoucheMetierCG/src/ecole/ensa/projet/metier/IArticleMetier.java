package ecole.ensa.projet.metier;

import java.rmi.Remote;
import java.rmi.RemoteException;

import ecole.ensa.projet.model.Article;
import ecole.ensa.projet.model.Grossiste;

public interface IArticleMetier extends Remote{
	Article ajouterArticle(String composition, String id_grossiste, 
			String nom, String prix, String type) throws RemoteException;
	
	Article afficherArticle (int id) throws RemoteException;

	


}
