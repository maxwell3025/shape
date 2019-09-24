package shape;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class Flower extends Applet implements MouseListener, ActionListener, MouseMotionListener{
	private static final long serialVersionUID = 7802072430685039226L;
	private static Vector<Line> lines = new Vector<Line>();
	private int fx, fy, ex, ey;

	public void paint(Graphics g) {
		// Timer t = new Timer();

		Arrow a = new Arrow();
		Arrow b = new Arrow();
		for (int i = 0; i < 1000; i++) {
			g.setColor(Color.BLACK);
			a.tick();
			g.drawLine((int) a.x, (int) a.y, (int) a.lx, (int) a.ly);
			g.setColor(Color.GREEN);
			b.tick();
			g.drawLine((int) b.x, (int) b.y, (int) b.lx, (int) b.ly);
			for (Line line : lines) {
				g.drawLine(line.startX, line.startY, line.endX, line.endY);
			}
		}
	}

	public void init() {
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		fx = e.getX();
		fy = e.getY();
		System.out.println("Press location: " + fx + "," + fy);
	}

	public void mouseReleased(MouseEvent e) {
		ex = e.getX();
		ey = e.getY();
		System.out.println("Release location: " + ex + "," + ey);

		repaint();
		lines.add(new Line(fx, fy, ex, ey));
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX()+" "+ e.getY());
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
 
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	class Line {
		public int startX;
		public int startY;
		public int endX;
		public int endY;

		public Line(int i1, int i2, int i3, int i4) {
			startX = i1;
			startY = i2;
			endX = i3;
			endY = i4;
		}
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
