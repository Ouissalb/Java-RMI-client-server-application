package ecole.ensa.projet.dao;

import ecole.ensa.projet.model.Client;

public interface IClientDao {
	
	Client searchClientByName(String name) ;

}
