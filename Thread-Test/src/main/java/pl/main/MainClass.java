package pl.main;

import java.awt.EventQueue;

import javax.swing.plaf.SliderUI;

public class MainClass {
	static MyFrame myFrame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				System.out.println("Create Frame");
				myFrame = new MyFrame();
				System.out.println("Create Frame End");
				System.out.println("CountThread Starts ===========");
				Thread thread = new Thread(myFrame);
				thread.start();
				System.out.println("CountThread Starts =========== timebefour");
				
				System.out.println("CountThread Starts =========== time after");
				Thread thread1 = new Thread(myFrame);
				thread1.start();
				System.out.println("CountThread Starts ===========");

				System.err.println("Dupa");
			
			}
		});

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				
			}
		});
			// System.out.println("Create ThreadInfo");
		// ThreadTest threadTest = new ThreadTest();
		// Thread threadTest1 = new Thread(threadTest);
		// threadTest1.start();
		// System.out.println("Create ThreadInfo End");

	}

	private static void sleep(int sekunds) {
		try {
			Thread.sleep(sekunds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
