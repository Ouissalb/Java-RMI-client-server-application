package ecole.ensa.projet.presentation;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecole.ensa.projet.metier.IArticleMetier;
import ecole.ensa.projet.metier.IClientMetier;
import ecole.ensa.projet.model.Article;
import ecole.ensa.projet.model.Client;

public class SearchProcServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
			//String keyword = null;
			String type = null;
			int priceMin = 0;
			int priceMax = 0;
			
			//keyword = req.getParameter("keyword");
			type = req.getParameter("selectType");
			priceMin = Integer.parseInt(req.getParameter("price-min"));
			priceMax = Integer.parseInt(req.getParameter("price-max"));
			
			//System.out.println("KEYWORD : "+keyword);
			System.out.println("TYPE :" + type);
			System.out.println("PRICE MIN :" + priceMin);
			System.out.println("PRICE MAX : "+ priceMax);
	
			 try {
		            IArticleMetier metierArticle = (IArticleMetier) Naming.lookup( "rmi://localhost/article" );
		            ArrayList<Article> a = metierArticle.getAll(priceMin , priceMax);

		            req.setAttribute( "articles", a );

		            //req.getRequestDispatcher( "/vues/showArticles.jsp" ).forward( req, resp );

		        } catch ( NotBoundException e ) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		
		if (noErrorFound())
		{
			//show articles
			req.getRequestDispatcher("/vues/showArticles.jsp").forward(req, resp);
		}
		else
		{
			//send errors to jsp page and show them
			req.getRequestDispatcher("/vues/clientSearch.jsp").forward(req, resp);
		}
		
		
		
	}

	private boolean noErrorFound() 
	{
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
