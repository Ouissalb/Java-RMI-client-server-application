package ecole.ensa.projet.metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ecole.ensa.projet.dao.ClientDao;
import ecole.ensa.projet.dao.IClientDao;
import ecole.ensa.projet.model.Client;

public class ClientMetier extends UnicastRemoteObject implements IClientMetier{
	
	public ClientMetier() throws RemoteException{
		super();
	}
	
	IClientDao dao = new ClientDao();
	@Override
	public Client searchClientByName(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return dao.searchClientByName(name);
	}


}
