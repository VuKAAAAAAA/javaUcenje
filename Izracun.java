import java.util.Scanner;

public class Izracun
{
	public static void Izracunaj(int x)
	{
		System.out.println("Kvadrat broja X ja: " + (x*x));
	}
	
	public static void Izracunaj(int x, int y)
	{
		System.out.println("Produkt broja X i Y je : " + (x*y));
	}

	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Upisi prvi broj:");
		a = input.nextInt();
		
		System.out.println("Upisi drugi broj:");
		b = input.nextInt();
		
		Izracunaj(a);
		Izracunaj(a,b);
	}

}
