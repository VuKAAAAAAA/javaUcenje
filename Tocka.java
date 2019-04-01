
public class Tocka
{
	int x;
	int y;
	
	public double udaljenost()
	{
		double udaljenost;
		udaljenost = Math.sqrt(Math.pow((double)x,2) + Math.pow((double)y,2));
		return udaljenost;
	}
	
	public Tocka()
	{
		x = 0;
		y = 0;
	}
	
	public Tocka(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public void Ispis()
	{
		System.out.println("X-kordinata: " + x);
		System.out.println("Y-kordinata: " + y);
		System.out.println("Udaljenost ishodista: " + udaljenost());
		
	}	

	public static void main(String[] args)
	{
		Tocka t1 = new Tocka();
		Tocka t2 = new Tocka(2,3);
		System.out.println("Tocka t1: ");
		t1.Ispis();
		System.out.println("Tocka t2: ");
		t2.Ispis();	
	}

}
