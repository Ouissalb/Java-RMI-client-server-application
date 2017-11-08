package ecole.ensa.projet.dao;

import java.util.ArrayList;

import ecole.ensa.projet.model.Article;

public interface IArticleDao 
{
	Article ajouterArticle(String composition, String id_grossiste, 
			String nom, String prix, String type);
	
	Article afficherArticle (int id);

	ArrayList<Article> getAll();
	
	ArrayList<Article> getAll(int min , int max);
}
