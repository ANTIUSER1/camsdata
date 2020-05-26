package pns.motion.coordinatesData;

public class Position3d {

	private double x;
	private double y;
	private double z;

	public Position3d( ) {
		super();
		this.x = Math.random();
		this.y = Math.random()+1 ;
		this.z = Math.random()+2;
	}

	public Position3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	
}
