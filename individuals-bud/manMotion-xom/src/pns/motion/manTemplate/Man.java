package pns.motion.manTemplate;

public class Man {
	private Head head = new Head();
	private Body body = new Body();
	private Hand leftHand = new Hand(false);
	private Hand rightHand = new Hand(true);
	private Hand leftLeg = new Hand(false);
	private Hand rightLeg = new Hand(true);

	private long moment = System.currentTimeMillis();

	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Man(Head head, Body body, Hand leftHand, Hand rightHand,
			Hand leftLeg, Hand rightLeg, long moment) {
		super();
		this.head = head;
		this.body = body;
		this.leftHand = leftHand;
		this.rightHand = rightHand;
		this.leftLeg = leftLeg;
		this.rightLeg = rightLeg;
		this.moment = moment;
	}

	public Head getHead() {
		return head;
	}

	public Body getBody() {
		return body;
	}

	public Hand getLeftHand() {
		return leftHand;
	}

	public Hand getRightHand() {
		return rightHand;
	}

	public Hand getLeftLeg() {
		return leftLeg;
	}

	public Hand getRightLeg() {
		return rightLeg;
	}

	public long getMoment() {
		return moment;
	}

}
