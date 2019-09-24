package shape;

import java.util.Random;

public class Arrow {
	double fvelocity;
	double avelocity;
	double acceleration;
	double aacceleration;
	double x;
	double y;
	double lx;
	double ly;

	public Arrow() {
		Random r = new Random();
		fvelocity = (r.nextDouble() - 0.5) * 2;
		avelocity = (r.nextDouble() - 0.5) * 2;
		acceleration = (r.nextDouble() - 0.5);
		aacceleration = (r.nextDouble() - 0.5);
		x = r.nextDouble() * 100;
		y = r.nextDouble() * 100;

	}

	public void tick() {
		lx = x;
		ly = y;
		x = x + fvelocity * Math.sin(avelocity);
		y = y + fvelocity * Math.cos(avelocity);
		fvelocity = fvelocity + acceleration;
		avelocity = avelocity + aacceleration;
		fvelocity = fvelocity-fvelocity*0.01;
		if (x <= 0) {
			x = 999;
			lx=x;
		}
		if (x >= 1000) {
			x = 1;
			lx=x;
		}
		if (y <= 0) {
			y = 999;
			ly=y;
		}
		if (y >= 1000) {
			y = 1;
			ly=y;
		}
		
		double d = Math.random();
		if(d<0.00001){
			Random r = new Random();
			acceleration = (r.nextDouble() - 0.5);
			aacceleration = (r.nextDouble() - 0.5); 
		}
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public double lx() {
		return lx;
	}

	public double ly() {
		return ly;
	}
	public static void main(String[] args){
		Arrow a = new Arrow();
		for (int i = 0; i<10000; i++){
			a.tick();
			System.out.println(""+a.x()+" "+a.y());
		}
	}
}
