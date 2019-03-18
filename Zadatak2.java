
public class Zadatak2 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		for (x=1; x<=5; x++)
		{
			for (y=5; y>x; y--)
			{
				System.out.print(" ");
			}
			for (z=1; z<2*x; z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
