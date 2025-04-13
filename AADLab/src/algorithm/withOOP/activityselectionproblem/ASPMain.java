package algorithm.withOOP.activityselectionproblem;

import java.util.ArrayList;
import java.util.Collections;

public class ASPMain {

	public static void main(String[] args) {
		ArrayList<ActivitySelectionProblem> list = new ArrayList<>();
		ActivitySelectionProblem activity1 = new ActivitySelectionProblem();
		activity1.setActivity("A1");
		activity1.setStart(0);
		activity1.setFinish(6);
		
		ActivitySelectionProblem activity2 = new ActivitySelectionProblem();
		activity2.setActivity("A2");
		activity2.setStart(3);
		activity2.setFinish(4);
		
		ActivitySelectionProblem activity3 = new ActivitySelectionProblem();
		activity3.setActivity("A3");
		activity3.setStart(1);
		activity3.setFinish(2);
		
		ActivitySelectionProblem activity4 = new ActivitySelectionProblem();
		activity4.setActivity("A4");
		activity4.setStart(5);
		activity4.setFinish(9);
		
		ActivitySelectionProblem activity5 = new ActivitySelectionProblem();
		activity5.setActivity("A5");
		activity5.setStart(5);
		activity5.setFinish(7);
		
		ActivitySelectionProblem activity6 = new ActivitySelectionProblem();
		activity6.setActivity("A6");
		activity6.setStart(8);
		activity6.setFinish(9);
		
		list.add(activity1);
		list.add(activity2);
		list.add(activity3);
		list.add(activity4);
		list.add(activity5);
		list.add(activity6);
		
		Collections.sort(list,new ASPComparator());
		int f = list.get(0).getFinish();
		System.out.print(list.get(0).getActivity()+" ");
		
		for(ActivitySelectionProblem problem : list)
		{
			if(f<problem.getStart()) {
				System.out.print(problem.getActivity()+" ");
				f=problem.getFinish();
			}
			
		}
	}

}
