package jsql.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;

import jsql.data.Request;
import jsql.data.Result;

public class MyClient extends Thread {
	
	private String IP;
	private int port;
	private Socket client;
	private ISocketConnection handle;
	private int iCount = 0;
	private int iNum = 0;
	
	public MyClient(String ip, int port, ISocketConnection handle){
		this.IP = ip;
		this.port = port;
		this.handle = handle;
	}
	public MyClient() {
	}
	@Override
	public void run() {
		try {
			client = new Socket(IP, port);
			handle.hasSocketConnected();
            while (client.isConnected()) {                                
                ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
                try {
					Result result = (Result) ois.readObject();
					iCount++;
					handle.hasResponse(result, iCount, iNum);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
            }
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			//JOptionPane.showMessageDialog(null, "Không thể kết nối với server!", "Lỗi", 1);
		}
		handle.hasSocketDisconnect();
	}
	
	public void stopClient(){
		try {
			client.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isConnected(){
		return client!=null && client.isConnected();
	}
	
	public int getRequestCount() {
		return iCount;
	}
	
	public int getNumRequest() {
		return iNum;
	}
	
	public boolean canSendRequest() {
		return iNum==iCount;
	}

	public void sendRequest(Vector<Request> requests) throws Exception {
		if (!isConnected()) {
			stopClient();
			throw new Exception("Must connect to a server!");
		}
		if (!canSendRequest()) throw new Exception("Sendding request. Do'nt execute a statement!");
		iCount = 0;
		iNum = requests.size();		
		for (Request request : requests) {
			//iCount++;
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
			oos.writeObject(request);
			oos.flush();
		}		
	}

}
