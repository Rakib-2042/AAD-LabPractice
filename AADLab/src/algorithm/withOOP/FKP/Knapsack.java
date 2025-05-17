package algorithm.withOOP.FKP;

import java.util.ArrayList;

public class Knapsack {
	public static void FKP(ArrayList<Itemvalues> items) {
		int capacity = 15;
		double totalvalue = 0;
		for(Itemvalues item : items) {
			int currvalue = item.getProfit();
			int currweight = item.getWeight();
			if(capacity - currweight >= 0) {
				capacity-=currweight;
				totalvalue+=currvalue;
			}else {
				double frac = (double)capacity/(double)currweight;
				totalvalue+=frac*currvalue;
				break;
			}
		}
		System.out.println(totalvalue);
	}
}
