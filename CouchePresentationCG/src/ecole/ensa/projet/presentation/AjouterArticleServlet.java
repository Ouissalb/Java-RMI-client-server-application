package ecole.ensa.projet.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterArticleServlet extends HttpServlet 
{
	public AjouterArticleServlet() {}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String usernameG = "";
		usernameG = req.getParameter("usernameG");
		req.setAttribute("usernameG", usernameG);
		
		req.getRequestDispatcher("/vues/addArticle.jsp").forward(req, resp);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
