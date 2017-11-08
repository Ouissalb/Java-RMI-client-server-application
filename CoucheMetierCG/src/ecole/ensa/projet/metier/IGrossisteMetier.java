package ecole.ensa.projet.metier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import ecole.ensa.projet.model.Grossiste;



public interface IGrossisteMetier extends Remote{
	Grossiste checkGrossisteLogin(String username, String password) throws RemoteException;
	Grossiste ajouterAuCercle(String username, String password, String nom, String coordonnees)throws RemoteException;
	Grossiste getAll(String username) throws RemoteException;
}
