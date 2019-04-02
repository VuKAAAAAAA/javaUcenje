
class Tocka
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
	public void NullPointerException()
	{
		
	}

	public static void main(String[] args)
	{
		
		Tocka t1 = new Tocka(1,1);
		Tocka t2 = new Tocka(4,3);
		Pravokutnik p1 = new Pravokutnik(t1, t2);
		Pravokutnik p2 = new Pravokutnik(1, 1, 5, 3);
		
		System.out.println("Tocka t1: ");
		t1.Ispis();
		System.out.println("Tocka t2: ");
		t2.Ispis();
		
		int opseg1 = p1.Opseg();
		double povrsina1 = p1.Povrsina();
		int opseg2 = p2.Opseg();
		double povrsina2 = p2.Povrsina();
		
		System.out.println("Opseg pravokutnika p1 je: " + opseg1);
		System.out.println("Povrsina pravokutnika p1 je: " + povrsina1);
		
		System.out.println("Opseg pravokutnika p2 je: " + opseg2);
		System.out.println("Povrsina pravokutnika p2 je: " + povrsina2);
		
	}

}

