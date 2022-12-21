package Day6;

public class BubbleSortTest {

	public static void main(String[] args) {
		int array [] = {10,12,24,04,20,11};
		
		for (int i=0; i<array.length; i++)
			System.out.println("array : "+array[i]);
		
		for (int x=0; x<array.length; x++)
			for(int y=x+1; y<array.length; y++)
				if(array[x]>array[y])
				{
					int temp;
					temp=array[x];
					array[x]=array[y];
					array[y]=temp;
				}
		System.out.println("After sorting : ");
		for (int i=0; i<array.length; i++)
			System.out.println("array: "+array[i]);
	}

}
