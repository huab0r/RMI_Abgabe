
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Quadrat extends Remote{
	public long hochzwei (long zahl) throws RemoteException;
}
