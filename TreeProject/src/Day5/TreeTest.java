package Day5;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>();
		System.out.println("Container Created");
		
		System.out.println("Adding 1st Value...");
		ts.add(3);
		
		System.out.println("Adding 2nd Value...");
		ts.add(8);
		
		System.out.println("Adding 3rd Value...");
		ts.add(10);
		
		System.out.println("Adding 4th Value...");
		ts.add(15);
		
		System.out.println("Adding 5th Value...");
		ts.add(20);
		
		System.out.println("Adding 6th Value...");
		ts.add(25);
		
		Iterator<Integer> treeSetIterator = ts.iterator();
		System.out.println("Retrived the iterator....");
		
		while(treeSetIterator.hasNext()) {
			
			Integer theElement = treeSetIterator.next();
			System.out.println("Element : "+theElement);
			
		}
		
		
		
	}

}
