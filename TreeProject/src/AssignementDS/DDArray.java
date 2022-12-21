package AssignementDS;

public class DDArray {
	//Double Dimensional Array

	

		public static void main(String[] args) 
		{	
			int COL = 11;
			int ROW = 4;
			int teamScore[][] = new int[ROW][COL];
			
			int score[][] = {
								{10,23,55, 66,80,12, 56,8,9, 3,12},
								{20,13,51, 6,85,32, 6,12,8, 32,1},
								{30,26,50, 96,18,52, 16,80,29, 34,2},
								{40,20,53, 56,12,19, 63,83,29, 35,3}
							};
			
			for (int i = 0; i < ROW; i++) 
			{
				for (int j = 0; j < COL; j++)
				{
					System.out.println("score : "+score[i][j]);
				}
				System.out.println("=====================================");
			}
		}

	}

