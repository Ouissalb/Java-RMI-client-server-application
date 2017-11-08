package ecole.ensa.projet.metier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import ecole.ensa.projet.model.Article;

public interface IArticleMetier extends Remote{
	Article ajouterArticle(String composition, String id_grossiste, 
			String nom, String prix, String type) throws RemoteException;
	
	Article afficherArticle (int id) throws RemoteException;

	ArrayList<Article> getAll();

	ArrayList<Article> getAll(int min , int max) throws RemoteException;

}
