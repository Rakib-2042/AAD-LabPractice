package algorithm.withOOP.FKP;

import java.util.Comparator;

public class FKPComparator implements Comparator<Itemvalues>{

	@Override
	public int compare(Itemvalues o1, Itemvalues o2) {
	
		double c1 = o1.getProfit()/o1.getWeight();
		double c2 = o2.getProfit()/o2.getWeight();
		if(c1 < c2)
			return 1;
		else
			return -1;
	}

}