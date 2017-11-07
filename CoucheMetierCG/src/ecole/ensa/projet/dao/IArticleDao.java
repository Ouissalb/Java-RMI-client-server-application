package ecole.ensa.projet.dao;

import ecole.ensa.projet.model.Article;

public interface IArticleDao 
{
	Article ajouterArticle(String composition, String id_grossiste, 
			String nom, String prix, String type);
	
	Article afficherArticle (int id);

}
