package pns.motion.manTemplate;

import pns.motion.coordinatesData.Position3d;

public class Body {
	private BodyElement topRightElement = new BodyElement();
	private BodyElement topLeftElement = new BodyElement();
	private BodyElement bottomRightElement = new BodyElement();
	private BodyElement bottomLeftElement = new BodyElement();
	private BodyElement centerElement = new BodyElement();

	public Body() {

	}

	public BodyElement getTopRightElement() {
		return topRightElement;
	}

	public void setTopRightElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet, boolean top,
			boolean right) {
		BodyElement topRightElement = new BodyElement(space, velocity,
				acceleration, magnet);
		this.topRightElement = topRightElement;
	}

	public BodyElement getTopLeftElement() {
		return topLeftElement;
	}

	public void setTopLeftElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet, boolean top,
			boolean right) {
		BodyElement topLeftElement = new BodyElement(space, velocity,
				acceleration, magnet);
		this.topLeftElement = topLeftElement;
	}

	public BodyElement getBottomRightElement() {
		return bottomRightElement;
	}

	public void setBottomRightElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet, boolean top,
			boolean right) {
		BodyElement bottomRightElement = new BodyElement(space, velocity,
				acceleration, magnet);
		this.bottomRightElement = bottomRightElement;
	}

	public BodyElement getBottomLeftElement() {
		return bottomLeftElement;
	}

	public void setBottomLeftElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet, boolean top,
			boolean right) {
		BodyElement bottomLeftElement = new BodyElement(space, velocity,
				acceleration, magnet);
		this.bottomLeftElement = bottomLeftElement;
	}

	public BodyElement getCenterElement() {
		return centerElement;
	}

	public void setCenterElement(Position3d space, Position3d velocity,
			Position3d acceleration, Position3d magnet, boolean top,
			boolean right) {
		BodyElement centerElement = new BodyElement(space, velocity,
				acceleration, magnet);
		this.centerElement = centerElement;
	}

}
