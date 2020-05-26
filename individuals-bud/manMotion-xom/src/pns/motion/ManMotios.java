package pns.motion;

import java.util.ArrayList;
import java.util.List;

import pns.motion.manTemplate.Man;

public class ManMotios {

	private List<Man> manList = new ArrayList<>();

	public ManMotios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void makeManMotios(int count) {

		for (int k = 0; k < count; k++) {
			Man man = new Man();
			manList.add(man);
			try {
				Thread.sleep(20L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}

	public List<Man> getManList() {
		return manList;
	}

}
