package ecole.ensa.projet.presentation;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecole.ensa.projet.metier.IClientMetier;
import ecole.ensa.projet.model.Client;

public class ClientSearchServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		/*try {
			IClientMetier metierClient =  (IClientMetier)Naming.lookup("rmi://localhost/test");
		}catch (NotBoundException e)
		{
			e.printStackTrace();
		}*/
		
		req.getRequestDispatcher("/vues/clientSearch.jsp").forward(req, resp);;
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}