package ecole.ensa.projet.server;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import ecole.ensa.projet.metier.ClientMetier;
import ecole.ensa.projet.metier.GrossisteMetier;



public class ServerRmi {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException
	{
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);
		/*ClientMetier metier = new ClientMetier();
		Naming.rebind("rmi://localhost/test", metier);*/
		
		GrossisteMetier metierG = new GrossisteMetier();
		Naming.rebind("rmi://localhost/grossiste", metierG);
		
		System.out.println("Serveur RMI en ecoute....");
	}

}
