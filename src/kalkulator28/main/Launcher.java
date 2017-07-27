package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import lib.MyGUI;

class Launcher {

	private static void showGUI() {
		MyGUI gUI = new MainGUI();
		JFrame frame = gUI.getGUIframe();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				showGUI();
			}
		});
	}
}
