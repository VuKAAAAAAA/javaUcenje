import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		System.out.println("Koliko zelite da vas niz ima elemenata:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int [] niz = new int[x];
		int i = 0;
		int broj = 0;
		
		for (i=0; i<x; i++)
		{
			System.out.println("Upisite " + (i+1) + ". element:");
			niz[i] = input.nextInt();
		}
		i = 0;
		int j = x-1;
		
		while (i!=j)
		{
			broj = niz[i];
			niz[i] = niz[j];
			niz[j] = broj;
			i++;
			j--;
		}
		for (i=0; i<x; i++)
		{
			System.out.println(niz[i]);
		}

	}

}
