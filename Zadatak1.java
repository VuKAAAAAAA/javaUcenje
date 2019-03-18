public class Zadatak1 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int suma = 2;
		int broj = 0;
		
		while(true)
		{
			broj = x + y;
			if (broj > 4000000)
			{
				break;
			}
			if (broj % 2 == 0)
			{
				suma += broj;
			}
			x = y;
			y = broj;
		}
		System.out.println("Suma parnih brojeva Fibonaccijeva niza je: " + suma);

	}

}
