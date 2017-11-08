package ecole.ensa.projet.metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import ecole.ensa.projet.dao.ArticleDao;
import ecole.ensa.projet.dao.IArticleDao;
import ecole.ensa.projet.model.Article;

public class ArticleMetier extends UnicastRemoteObject implements IArticleMetier{
	public ArticleMetier() throws RemoteException{
		super();
	}
	
	IArticleDao dao = new ArticleDao();

	@Override
	public Article ajouterArticle(String composition, String id_grossiste, String nom, String prix, String type)
			throws RemoteException {
		// TODO Auto-generated method stub
		return dao.ajouterArticle(composition, id_grossiste, nom, prix, type);
	}

	@Override
	public Article afficherArticle(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return dao.afficherArticle(id);
	}

    @Override
    public ArrayList<Article> getAll() throws RemoteException{
        
        return dao.getAll();
    }

    @Override
    public ArrayList<Article> getAll( int min, int max ) throws RemoteException {
        return dao.getAll(min , max);
    }
}
