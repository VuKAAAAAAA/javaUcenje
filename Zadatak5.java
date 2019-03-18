import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		System.out.println("Koliko zelite da vas niz ima elemenata:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int [] niz = new int[x];
		float suma = 0;
		float prosjek = 0;
		int i = 0;
		
		for (i=0; i<x; i++)
		{
			System.out.println("Upisite " + (i+1) + ". element:");
			niz[i] = input.nextInt();
			suma += niz[i];
		}
		prosjek = suma / x;
		System.out.println("Suma niza je: " + suma);
		System.out.println("Prosjek niza je: " + prosjek);

	}

}
