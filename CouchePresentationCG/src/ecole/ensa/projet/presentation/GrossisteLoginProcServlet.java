package ecole.ensa.projet.presentation;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecole.ensa.projet.metier.IGrossisteMetier;
import ecole.ensa.projet.model.Grossiste;

public class GrossisteLoginProcServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String username = "";
		String password = "";
		username = req.getParameter("username");
		password = req.getParameter("password");
		Grossiste modelGrossiste = null;
		
		try 
		{
			
			System.out.println("USERNAME IN SERVLET IS :" +username);
			System.out.println("PASSWORD IN SERVLET IS :" +password);
			
			IGrossisteMetier metierGrossiste =  (IGrossisteMetier)Naming.lookup("rmi://localhost/grossiste");
			modelGrossiste = metierGrossiste.checkGrossisteLogin(username, password);
			System.out.println("STEP 1 DONE");
			System.out.println("grossiste : "+modelGrossiste.getCoordonnees()+ " "+
			modelGrossiste.getNom()  + "  " +modelGrossiste.getPassword() + " " + modelGrossiste.getUsername());
			
			req.setAttribute("usernameG", modelGrossiste.getUsername());
			System.out.println("IN GrossisteLoginProc, usernameG = " +modelGrossiste.getUsername());
			
		}catch (NotBoundException e)
		{
			e.printStackTrace();
		}
		
		if (modelGrossiste != null )
		{
			req.getRequestDispatcher("/vues/grossisteTasks.jsp").forward(req, resp);
		}
		/*else if (modelGrossiste == null)
		{
			//show errors
			req.getRequestDispatcher("/vues/grossisteLogin.jsp").forward(req, resp);
		}*/
			
		
			
		
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
