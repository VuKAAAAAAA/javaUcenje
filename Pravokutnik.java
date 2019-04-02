
public class Pravokutnik
{
	Tocka gornja_desna;
	Tocka donja_liva;
	
	int sirina;
	int visina;
	
	Pravokutnik(Tocka a, Tocka b)
	{
		gornja_desna.x = a.x;
		gornja_desna.y = a.y;
		
		donja_liva.x = b.x;
		donja_liva.y = b.y;
	}

	
	Pravokutnik(int t1_x, int t1_y, int t2_x, int t2_y)
	{
		gornja_desna.x = t1_x;
		gornja_desna.y = t1_y;
		donja_liva.x = t2_x;
		donja_liva.y = t2_y;
	}
	
	public int Opseg()
	{
		sirina = Math.abs(donja_liva.x - gornja_desna.y);
		visina = Math.abs(donja_liva.y - gornja_desna.y);
		
		return (2 * sirina + 2 * visina);
	}
	
	public double Povrsina()
	{
		sirina = Math.abs(donja_liva.x - gornja_desna.y);
		visina = Math.abs(donja_liva.y - gornja_desna.y);
		
		return (sirina * visina);
	}

}
