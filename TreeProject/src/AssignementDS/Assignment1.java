package AssignementDS;

public class Assignment1 {
	 
	
		public static void main(String[] args) 
		{
			//int carArray[] = new int[10000000];
			int carArray[] = {0, 1, 0, 1, 1};
			
			Solution s = new Solution();
			
			System.out.println("No. of possible pairs are : "+s.solution(carArray));
		}
	}

	class Solution
	{
		public int solution(int[] arr)
		{
			int pairCount = 0;
			if(arr.length>0 && arr.length< 100001)
			{
				for (int i = 0; i < arr.length; i++) 
				{
						for (int j = i+1; j < arr.length; j++) 
						{
							if(arr[i]<arr[j])
								pairCount++;
						}
				}
			if(pairCount < 1000000001)
			return pairCount;
			}
				return -1;
		}
	}


