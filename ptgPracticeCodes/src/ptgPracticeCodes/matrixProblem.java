package ptgPracticeCodes;

public class matrixProblem {
	
	public static void main(String args[])
	{
		int[][] matrix = new int[4][4];
		int put = 1;
		for(int i =0;i<=3; i++)
		{
			for(int j =0; j<=3;j++)
			{
				//System.out.println(ch++);
				matrix[i][j] = put++;
				//System.out.println(matrix[i][j]);
			}
		}
		int[][] finalMatrix = new int[4][4];
		//System.out.println(matrix[3][0]);
		for(int i =0; i<=3;i++)
		{
			for(int j=0,l=3;j<=3;j++,l--)
			{
				finalMatrix[i][j]= matrix[l][i];
				System.out.print( finalMatrix[i][j] + " "); 
		        System.out.println();  
				
			}
		}
		
		for (int i = 0; i < 4; i++) 
	    { 
	        for (int j = 0; j < 4; j++) 
	        System.out.print( finalMatrix[i][j] + " "); 
	        System.out.println(); 
	    } 
	}
}
