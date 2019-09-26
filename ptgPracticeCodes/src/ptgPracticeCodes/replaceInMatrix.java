package ptgPracticeCodes;

public class replaceInMatrix {
	
	public static void main(String args[])
	{
		String [][] arr = { { "a", "b", "c", "d" }, 
                { "e", "a", "g", "h" }, 
                { "i", "j", "a", "l" }, 
                { "m", "n", "o", "a" } }; 
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(arr[i][j].equals("a"))
				{
					arr[i][j]="x";
				}
				//System.out.print( arr[i][j] + " "); 
		        //System.out.println(); 
			}
		}
		
		for (int i = 0; i <=3; i++) 
	    { 
	        for (int j = 0; j <=3; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
		
	}
}
