package ecole.ensa.projet.dao;

import ecole.ensa.projet.model.Client;

public class ClientDao implements IClientDao 
{
	@Override
	public Client searchClientByName(String name) {
		// TODO Auto-generated method stub
		Client e = new Client("OUISSAL");
		return e;
	}

}
