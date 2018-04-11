import java.rmi.*;
import java.rmi.server.*;
public class HelloWorldClient {
	static public void main (String[] args) /*args[0]: host, args[1]: port*/
	{
		String host = (args.length < 1) ? "localhost" : args[0];
		int port = (args.length < 2) ? 4711 : Integer.parseInt(args[1]);
		try {
			/*if (System.getSecurityManager() == null) {
				System.setSecurityManager (new RMISecurityManager());
			}*/
			Hello obj = (Hello) Naming.lookup ("rmi://" + host + ":" + port + "/" + "HelloObj");
			System.out.println (obj.sayHello("GB"));
			System.out.println (obj.sayHello("Deutsch"));
			System.out.println (obj.sayHello("italiano"));
			System.out.println (obj.sayHello("français"));
			} catch (Exception e) {
				System.out.println ("HelloClient failed, caught exception " + e.getMessage());
		}
	}
}