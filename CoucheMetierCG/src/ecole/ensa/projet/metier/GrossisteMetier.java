package ecole.ensa.projet.metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ecole.ensa.projet.dao.GrossisteDao;
import ecole.ensa.projet.dao.IGrossisteDao;
import ecole.ensa.projet.model.Grossiste;

public class GrossisteMetier extends UnicastRemoteObject implements IGrossisteMetier{
	
	public GrossisteMetier() throws RemoteException{
		super();
	}
	
	IGrossisteDao dao = new GrossisteDao();

	@Override
	public Grossiste checkGrossisteLogin(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		
		return dao.checkGrossisteLogin(username, password);
	}

	@Override
	public Grossiste ajouterAuCercle(String username, String password, String nom, String coordonnees) {
		// TODO Auto-generated method stub
		return dao.ajouterAuCercle(username, password, nom, coordonnees);
	}


}
