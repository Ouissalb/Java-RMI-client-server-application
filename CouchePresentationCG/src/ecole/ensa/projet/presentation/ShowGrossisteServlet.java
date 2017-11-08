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
import ecole.ensa.projet.metier.IGrossisteMetier;
import ecole.ensa.projet.model.Article;
import ecole.ensa.projet.model.Grossiste;

public class ShowGrossisteServlet extends HttpServlet 
{
	public ShowGrossisteServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 try {
	            IGrossisteMetier metierGrossiste = (IGrossisteMetier) Naming.lookup( "rmi://localhost/grossiste" );
	            
	            String usernameG = "";
	    		usernameG = request.getParameter("username");
	    		
	            Grossiste grossiste = metierGrossiste.getAll(usernameG);

	            request.setAttribute( "grossisteNom", grossiste.getNom());
	            request.setAttribute( "grossisteCoord", grossiste.getCoordonnees());
	            
	            System.out.println("JHGFQSFJHQSJHQKJhhdgfjhsdgfjhg"+grossiste.getCoordonnees());
	     

	            request.getRequestDispatcher( "/vues/grossisteCoord.jsp" ).forward( request, response );

	        } catch ( NotBoundException e ) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
		
		
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	}


