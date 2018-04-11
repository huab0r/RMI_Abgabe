import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class QuadratServer {

	public static void main (String[] args) throws RemoteException {
		int port = 4711;
		QuadratImpl obj = new QuadratImpl();								//erstellt ein Objekt von QuadratImpl
		String objName = "QuadratObj";
		/*if (System.getSecurityManager() == null) {
			System.setSecurityManager (new RMISecurityManager());
		}*/
		Registry registry = LocateRegistry.getRegistry (port);				//erstellt eine Registry auf den port
		boolean bound = false;
		for (int i = 0; ! bound && i < 2; i++) {
			try {
				registry.rebind (objName, obj);
				bound = true;
				System.out.println (objName+" bound to registry, port " + port + ".");
			}
			catch (RemoteException e) {
				System.out.println ("Rebinding " + objName + " failed, " + "retrying ...");
				registry = LocateRegistry.createRegistry (port);
				System.out.println ("Registry started on port " + port + ".");
			}
		}
		System.out.println ("QuadratServer ready.");
	}
	
	
	
	
	
}
