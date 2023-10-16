package ServerPack;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerCalc {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			//La premiere etape:
			//à completer (TODO)
			System.out.println("Je suis un serveur en attente la cnx d\'un client");
			
			Socket s = ss.accept();
		//la deuxieme etape:
			System.out.println("un client est connecté");
		//La derniere etape: fermer socket
			//à completer (TODO)
			InputStream is= s.getInputStream();
			OutputStream os= s.getOutputStream();
		}
		catch (IOException e)
		{
		e.printStackTrace();
	}
		
		}
	}
 

	}
 
