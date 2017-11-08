package ecole.ensa.projet.metier;

import java.rmi.Remote;
import java.rmi.RemoteException;

import ecole.ensa.projet.model.Client;


public interface IClientMetier extends Remote{
	
	public Client searchClientByName(String name) throws RemoteException;
	
}
