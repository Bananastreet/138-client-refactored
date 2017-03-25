import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Color;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

/**
 * The class that will launch the client.
 * 
 * @author Freyr
 */
public class ClientLoader extends JFrame implements AppletStub {

	private static final long serialVersionUID = -1657955994522660237L;

	private String host = "http://127.0.0.1";
	private Client client = new Client();
	private Map<String, String> params = new HashMap<>();	

	public static void main(String[] args) throws Exception {
		ClientLoader app = new ClientLoader();
		app.startApplet();
	}

	public ClientLoader() {
		super("OSRS #138");
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(781, 541));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void startApplet() {
		try {
			params.put("1", "0");
			params.put("2", "true");
			params.put("3", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
			params.put("4", "0");
			params.put("5", "false");
			params.put("6", "");
			params.put("7", ".runescape.com");
			params.put("8", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
			params.put("9", "0");
			params.put("10", "false");
			params.put("11", "301");			
			params.put("12", "4665");
			params.put("13", "0");
			params.put("14", "5");
			params.put("15", "0");

			client.setStub(this);

			add(client);
			pack();
			setVisible(true);

			client.init();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void appletResize(int width, int height) {
		client.resize(width, height);
	}

	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL(host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public URL getDocumentBase() {
		try {
			return new URL(host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getParameter(String key) {
		return params.get(key);
	}
	
}