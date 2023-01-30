package com;

import java.util.Comparator;

public class SortingJobs  implements Comparator<Job> {

	@Override
	public int compare(Job o1, Job o2) {
		if(o1.ed<o2.ed) {
			return 1;
		}else {
			return 0;
		}
	}	
}
