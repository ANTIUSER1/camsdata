package pns.motion.limbTemplate;

import javax.xml.bind.annotation.XmlTransient;

import pns.motion.coordinatesData.Position3d;

public class LimbElement {

	@XmlTransient
	protected Position3d space;
	protected Position3d velocity;
	protected Position3d acceleration;
	protected Position3d magnet;
	protected boolean inUse = true;

	public LimbElement() {
		this.space = new Position3d();
		this.velocity = new Position3d();
		this.acceleration = new Position3d();
		this.magnet = new Position3d();

	}

	public LimbElement(boolean inUse) {
		this();
		this.inUse = inUse;
	}

	public LimbElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet) {
		super();
		this.space = space;
		this.velocity = velocity;
		this.acceleration = acceleration;
		this.magnet = magnet;
	}

	// public Position3d getSpace() {
	// return space;
	// }

	public Position3d getVelocity() {
		return velocity;
	}

	public boolean isInUse() {
		return inUse;
	}

	public Position3d getAcceleration() {
		return acceleration;
	}

	public Position3d getMagnet() {
		return magnet;
	}
}
