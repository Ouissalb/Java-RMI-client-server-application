package ecole.ensa.projet.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterArticleProcServlet extends HttpServlet {
//TODO
	public AjouterArticleProcServlet() {}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
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
