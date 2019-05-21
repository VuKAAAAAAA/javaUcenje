import java.util.Scanner;

public class Argument
{
	static void Izracunaj(int x)
	{
		System.out.println("Kvadrat broja " + x + " je " + x*x );
	}

	static void Izracunaj(int x, int y)
	{
		System.out.println("Produkt brojeva " + x + " i " + y + " je " + x*y );
	}

	public static void main(String[] args)
	{
		int unos1 = 0;
		int unos2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj: ");
		unos1 = input.nextInt();
		
		System.out.println("Unesi drugi broj: ");
		unos2 = input.nextInt();
		
		Izracunaj(unos1);
		Izracunaj(unos1, unos2);
		
	}

}
