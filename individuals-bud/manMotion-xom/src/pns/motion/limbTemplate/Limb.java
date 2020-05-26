package pns.motion.limbTemplate;

public class Limb {

	private boolean isRight = false;
	private LimbTop top = new LimbTop();
	private LimbBottom bottom = new LimbBottom();
	private LimbEnd end = new LimbEnd();

	public Limb(boolean isRight) {
		super();
		this.isRight = isRight;
	}

	public boolean isRight() {
		return isRight;
	}

	public LimbTop getTop() {
		return top;
	}

	public LimbBottom getBottom() {
		return bottom;
	}

	public LimbEnd getEnd() {
		return end;
	}

}
