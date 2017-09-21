/**
 * 
 */
package modele;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Been WhereU
 *
 */
public class Network {
	

	private int port;
	Socket socketClient;
	ServerSocket socketServeur;
	

	//constructeur avec port different
	public Network(int portIN) {
		this.port = portIN;
	}
	
	//creation d'un serveur tcp
	public void Serveur() {
		try {
			socketServeur = new ServerSocket(port);
			System.out.println("Demarrage du serveur ...");
			socketClient = socketServeur.accept();
			System.out.println("La connexion avec le client : " + socketClient.getInetAddress() + "a ete etablie.");
		} catch (Exception e) {
		}
	}

	//creation d'un client tcp
	public void Client(String host){
		
		try{
			InetAddress server = InetAddress.getByName(host);
			socketClient = new Socket(server, port);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//demande d'une nouvelle valeur
	public int getValNetwork(){
		int Net = 0;
		return Net;
	}
	
	//ecriture d'une nouvelle valeur
	public void setValReseau(){
		
	}
	
	//arret du reseau tcp
	public void CloseReseau() throws IOException{
		socketClient.close();
}

}
