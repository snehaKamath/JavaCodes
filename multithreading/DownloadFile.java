
import java.io.*;
import java.net.*;

public class DownloadFile implements Runnable {

	String url;
	int threadNumber;

	DownloadFile(String url, int i) {
		this.url = url;
		this.threadNumber = i;
	}

	@SuppressWarnings("deprecation")
	public void run() {

		URL link;
		InputStream is = null;
		DataInputStream dis;
		String s;
		FileWriter fw = null;
		try {
			fw = new FileWriter("out.txt");
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try {

			link = new URL(this.url);

			is = link.openStream();
			dis = new DataInputStream(new BufferedInputStream(is));

			while ((s = dis.readLine()) != null) {
				fw.write(s);
			}
			System.out.println("Thread: " + this.threadNumber + " File from " + this.url + "is downloaded");
		} catch (MalformedURLException mue) {

			System.out.println("MalformedURLException");
			mue.printStackTrace();
			System.exit(1);

		} catch (IOException ioe) {

			System.out.println("IOException");
			ioe.printStackTrace();
			System.exit(1);

		} finally {

			try {
				is.close();
			} catch (IOException ioe) {

			}

		}

	}

}