import java.rmi.Naming;

import javax.swing.JOptionPane;

public class QuadratClient {

	
	static public void main (String[] args){
		String host = "localhost";
		int port = 4711;
		try {			
			String eingabe = JOptionPane.showInputDialog(null, "Geben sie ihre Zahl ein!");
			int eing = Integer.parseInt(eingabe);
			Quadrat obj = (Quadrat) Naming.lookup ("rmi://" + host + ":" + port + "/" + "QuadratObj");
			System.out.println (obj.hochzwei((long) eing));
			} catch (Exception e) {
				System.out.println ("QuadratClient failed, caught exception " + e.getMessage());
		}
	}
}
