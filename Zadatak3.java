
public class Zadatak3 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		int w = 0;
		
		for (x=1; x<=5; x++)
		{
			for (y=5; y>x; y--)
			{
				System.out.print(" ");
			}
			for (z=x; z>=1; z--)
			{
				System.out.print(z);
			}
			for (w=2; w<=x; w++)
			{
				System.out.print(w);
			}
			System.out.println();
		}
	}

	}
