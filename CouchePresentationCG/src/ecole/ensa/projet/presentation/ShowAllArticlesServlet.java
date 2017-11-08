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
import ecole.ensa.projet.model.Article;

public class ShowAllArticlesServlet extends HttpServlet {
    public ShowAllArticlesServlet() {
    }

    public void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {

        req.getRequestDispatcher( "/vues/showAll.jsp" ).forward( req, resp );

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    public void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        try {
            IArticleMetier metierArticle = (IArticleMetier) Naming.lookup( "rmi://localhost/article" );
            ArrayList<Article> a = metierArticle.getAll();

            request.setAttribute( "articles", a );

            request.getRequestDispatcher( "/vues/showArticles.jsp" ).forward( request, response );

        } catch ( NotBoundException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
