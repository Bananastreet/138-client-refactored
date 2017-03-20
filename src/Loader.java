
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import javax.swing.JFrame;

public class Loader implements AppletStub {

	private static URL codebase;
	private static HashMap<String, String> cfg = new HashMap<String, String>();
	private static HashMap<String, String> params = new HashMap<String, String>();

	public static void main(String[] args) throws Exception {
		codebase = new URL(args.length == 0 ? "http://oldschool1.runescape.com" : args[0]);
		parseParams(new URL(codebase, "jav_config.ws").openStream());
		Client client = new Client();
		client.setPreferredSize(new Dimension(Integer.parseInt(cfg.get("applet_minwidth")),
				Integer.parseInt(cfg.get("applet_minheight"))));
		client.setStub(new Loader());
		client.init();
		String title = new File(".").getCanonicalPath();
		title = title.substring(title.lastIndexOf('\\') + 1);
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(client);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private static void parseParams(InputStream stream) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		String line;
		while ((line = br.readLine()) != null) {
			int idx = line.indexOf('=');
			if (idx != -1) {
				String key = line.substring(0, idx);
				String val = line.substring(idx + 1);
				if (key.equals("param")) {
					idx = val.indexOf('=');
					key = val.substring(0, idx);
					val = val.substring(idx + 1);
					params.put(key, val);
				} else {
					cfg.put(key, val);
				}
			}
		}
	}

	@Override
	public boolean isActive() {
		return false;
	}

	@Override
	public URL getDocumentBase() {
		return codebase;
	}

	@Override
	public URL getCodeBase() {
		return codebase;
	}

	@Override
	public String getParameter(String name) {
		return params.get(name);
	}

	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	@Override
	public void appletResize(int width, int height) {
	}

}
