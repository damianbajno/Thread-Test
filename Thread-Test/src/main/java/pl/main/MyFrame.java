package pl.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements Runnable {

	private static Integer i=1;
	JLabel label = new JLabel();

	public MyFrame() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		add(label);
		i++;
		setTitle(i.toString());
		//		startThread();
	}

//	public void startThread() {
//		Thread thread = new Thread(this);
//		thread.start();
//
//	}

	public void run() {
		System.out.println("--- Start Thread ----");
		for (int i = 6; i > 0; i--) {
			label.setText("Bomba wybuchnie za = " + (i));
			System.out.println("Bomba wybuchnie za = " + (i));
			sleep(1);
		}
		System.out.println("--- Stop Thread ----");

	}

	public void printBoom()
	{
		label.setText("===BOOM===");
	}
	private void sleep(int s) {
		try {
			Thread.sleep(s*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
