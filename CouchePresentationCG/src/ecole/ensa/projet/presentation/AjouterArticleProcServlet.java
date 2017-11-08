package ecole.ensa.projet.presentation;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecole.ensa.projet.metier.IArticleMetier;
import ecole.ensa.projet.metier.IGrossisteMetier;
import ecole.ensa.projet.model.Article;
import ecole.ensa.projet.model.Grossiste;

public class AjouterArticleProcServlet extends HttpServlet {
//TODO
	public AjouterArticleProcServlet() {}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String usernameG = "";
		usernameG = req.getParameter("usernameG");
		req.setAttribute("usernameG", usernameG);
		
		String acrticleName = "";
		String articlePrice = "";
		String articleType  = "";
		String articleComposition = "";

		
		acrticleName = req.getParameter("article-name");
		articlePrice = req.getParameter("article-price");
		articleType = req.getParameter("article-type");
		articleComposition = req.getParameter("article-composition");
	
		
		Article modelArticle = null;
		
		try
		{
			
			System.out.println("article-name IN SERVLET IS :" +acrticleName);
			System.out.println("article-type IN SERVLET IS :" +articleType);
			
			IArticleMetier metierArticle =  (IArticleMetier)Naming.lookup("rmi://localhost/article");
			modelArticle =  metierArticle.ajouterArticle(articleComposition, usernameG, acrticleName, articlePrice, articleType);
			
			System.out.println( modelArticle.getNom() );
			System.out.println("GROSSSITE USERNAME IS : " + usernameG);
			
		}catch (NotBoundException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		//ajouter l'article à la bd
		
		
		
		//send errors as attributes (if any) and show them in addArticle.jsp
	//else
		//forward to this page
		req.getRequestDispatcher("/vues/grossisteTasks.jsp").forward(req, resp);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
