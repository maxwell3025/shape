package shape;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Graph extends Applet {
	public void paint(Graphics g) {
		int[] bin = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int i = 0;
		int amount = 1;
		g.setColor(new Color(0,128, 64));
		for (bin[0] = 1; bin[0] < 3; bin[0]++) {
			for (bin[1] = 1; bin[1] < 3; bin[1]++) {
				for (bin[2] = 1; bin[2] < 3; bin[2]++) {
					for (bin[3] = 1; bin[3] < 3; bin[3]++) {
						for (bin[4] = 1; bin[4] < 3; bin[4]++) {
							for (bin[5] = 1; bin[5] < 3; bin[5]++) {
								for (bin[6] = 1; bin[6] < 3; bin[6]++) {
									for (bin[7]= 1; bin[7] < 3; bin[7]++) {
										for (bin[8] = 1; bin[8] < 3; bin[8]++) {
											for (bin[9] = 1; bin[9] < 3; bin[9]++) {
												for (bin[10] = 1; bin[10] < 3; bin[10]++) {
													for (int index = 0; index < bin.length - 1; index++) {
														amount = amount
																* bin[index + 1];
													}
													i++;
													g.drawLine(i*2, 900, i*2, 900-amount);
													amount = 1;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
