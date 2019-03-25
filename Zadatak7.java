
public class Zadatak7
{

	public static void main(String[] args)
	{
		int [] [] niz = new int[5][5];
		int broj = 1;
		
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				niz [i][j] = broj;
				broj++;
				
				if(niz[i][j] < 10)
				{
					System.out.print("0" + niz[i][j] + " ");
				}
				else
				{
					System.out.print(niz[i][j] + " ");
				}
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i<=j && niz[i][j] < 10)
				{
					System.out.print("0" + niz[i][j] + " ");
				}
				else if(i<=j)
				{
					System.out.print(niz[i][j] + " ");
				}
				else
					System.out.print("   ");
			}	
			System.out.println();
		}
		System.out.println();	
	}

}
