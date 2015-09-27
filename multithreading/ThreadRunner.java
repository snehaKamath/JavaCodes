public class ThreadRunner {

	public static void main(String args[]) {

		DownloadFile file1 = new DownloadFile("http://www.sjsu.edu/giving/ways-to-give/partnership/index.html",1);

		Thread thread1 = new Thread(file1);
		thread1.start();

		DownloadFile file2 = new DownloadFile("http://www.sjsu.edu/giving/ways-to-give/partnership/corportate/index.html",2);

		Thread thread2 = new Thread(file2);
		thread2.start();
		
		DownloadFile file3 = new DownloadFile("http://www.sjsu.edu/giving/ways-to-give/partnership/foundations/index.html",3);

		Thread thread3 = new Thread(file3);
		thread3.start();
		
		DownloadFile file4 = new DownloadFile("http://www.sjsu.edu/discover/index.html",4);

		Thread thread4 = new Thread(file4);
		thread4.start();
		

		Thread thread5 = new TimerThread();
		thread5.start();

	}

}