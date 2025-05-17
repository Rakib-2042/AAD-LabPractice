package algorithm.withOOP.FKP;

import java.util.ArrayList;
import java.util.Collections;

public class FKP {

	public static void main(String[] args) {
ArrayList<Itemvalues> list = new ArrayList<>();
		
		Itemvalues item1 = new Itemvalues(1,12,3);
		Itemvalues item2 = new Itemvalues(2,5,1);
		Itemvalues item3 = new Itemvalues(3,16,4);
		Itemvalues item4 = new Itemvalues(4,7,2);
		Itemvalues item5 = new Itemvalues(5,9,9);
		Itemvalues item6 = new Itemvalues(6,11,4);
		Itemvalues item7 = new Itemvalues(7,6,3);
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(item5);
		list.add(item6);
		list.add(item7);
		
		Collections.sort(list,new FKPComparator());
		Knapsack fkp = new Knapsack();
		fkp.FKP(list);

	}

}
