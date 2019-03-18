
public class Zadatak4 {

	public static void main(String[] args) {
		int [] niz = new int [100];
		niz [0] = 0;
		int i = 0;
		int broj = 7;
		
		for(i=0; i<100; i++)
		{
			niz[i] = broj;
			broj += 7;
			System.out.println("Element " + niz[i]);
		}

	}

}
