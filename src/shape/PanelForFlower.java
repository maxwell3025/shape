package shape;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class PanelForFlower extends JFrame implements WindowListener {
	public PanelForFlower() {
		Flower q = new Flower();
		getContentPane().add(q, BorderLayout.CENTER);
		setSize(new Dimension(1920, 1080));
		setVisible(true);

	}

	public static void main(String[] args) {
		PanelForFlower pan = new PanelForFlower();

	}

	public void windowOpened(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowDeactivated(WindowEvent e) {

	}

}
