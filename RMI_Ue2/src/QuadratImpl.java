import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class QuadratImpl extends UnicastRemoteObject implements Quadrat {

	protected QuadratImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long hochzwei(long zahl) throws RemoteException {
		// TODO Auto-generated method stub
		long erg = (long) Math.pow(zahl, 2);
		return erg;
	}

}
