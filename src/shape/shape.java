package shape;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class shape extends Applet {
	public void paint(Graphics g) {
		g.drawRect(1, 1, 1, 1);
		Random random = new Random();
		Random random2 = new Random();
		int re = 255;
		
		int gr = 255;
		
		int bl = 255;
		int trans = 0;
		int res = 64;
			for (double x = -1; x < 1; x = x + 1.0 / res) {
				for (double y = -1; y < 1; y = y + 1.0 / res) {
					if (1> x*x+y*y) {
						g.setColor(new Color(255, 0, 0));
						g.drawRect((int) Math.round(x * res) + res
								+ (510 - res / 2), (int) Math.round(y * res)
								+ res, 1, 1);
					}
					/*else if ((random.nextDouble()-0.5)*5 < Math.abs(Math.sin(x*10)-Math.cos(y*10))) {
						g.setColor(new Color(0, 0, 255));
						g.drawRect((int) Math.round(x * res) + res
								+ (510 - res / 2), (int) Math.round(y * res)
								+ res, 1, 1);
					}*/
					
				}
			}
	}
	public void repaint(Graphics g) {
		paint(g);
	}
}
