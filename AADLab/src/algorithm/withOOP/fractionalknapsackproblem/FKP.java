package algorithm.withOOP.fractionalknapsackproblem;

import java.util.ArrayList;
import java.util.Collections;

public class FKP {

	public static void main(String[] args) {
		ArrayList<ItemValue> list = new ArrayList<ItemValue>();
		
		ItemValue item1 = new ItemValue(1,12,3);
		ItemValue item2 = new ItemValue(2,5,1);
		ItemValue item3 = new ItemValue(3,16,4);
		ItemValue item4 = new ItemValue(4,7,2);
		ItemValue item5 = new ItemValue(5,9,9);
		ItemValue item6 = new ItemValue(6,11,4);
		ItemValue item7 = new ItemValue(7,6,3);
		
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
