package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingSortingProject {

	public static void main(String[] args) {
		int array[]= {10,90,24,12,4,11,7};
		//
	//int arrat2[]= new int [100];
		
		
		for (int i = 0; i<array.length; i++) 
			System.out.println("array : "+array[i]);
		 
		 System.out.println("Sorting: ");
		 Arrays.sort(array);
		 System.out.println("Sorted: ");
		
	    for (int i = 0; i<array.length; i++) 
				System.out.println("array : "+array[i]);
			
		 int data=MyIOService.getInteger("Enter data to Search: ");
		 
		 int first = 0;
		 int last = array.length -1;
		 int middle = (first + last)/2;
		 
		 while (first<= last)
		 {
			 if(array[middle]<data)
				 first = middle+1;
			 
			 else if (array[middle]== data)
			 {
				 System.out.println("found the data : "+data+" at location "+(middle+1));
				 break;
			 }
			 else 
				 last = middle-1;
			 middle=(first+last)/2;
			 
			 if(first>last)
				 System.out.println("no data found"); 
		 
		 
		 }
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //		 boolean found = false;
//		 for (int i = 0; i<array.length; i++) {
//			 if(data == array[i]) 
//			 {
//				 found = true;
//				 break;
//			 }
//		 }
//		 if (found == true)
//			 System.out.println("found data : "+data);
//		 else
//			 System.out.println("Data not found...");
		
		}
	} 


class MyIOService
{
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner scan= new Scanner(System.in);
		int temp = scan.nextInt();
		return temp;
	}
	
}