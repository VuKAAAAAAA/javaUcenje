import java.util.Scanner;

public class Datum
{
	private int dan, mjesec, godina;
	Scanner input = new Scanner(System.in);
	
	public Datum()
	{
		this.dan = 1;
		this.mjesec = 1;
		this.godina = 1;
	}
	
	public int getDan()
	{
		return dan;
	}
	
	public int getMjesec()
	{
		return mjesec;
	}
	
	public int getGodina()
	{
		return godina;
	}
	
	public void setDan(int d)
	{
		do
		{
			if(d < 1 || d > 30)
			{
				System.out.println("Krivi unos ! Ponovite unos: ");
				d = input.nextInt();
			}
			else
			{
				dan = d;
			}
				
		}
		while(d < 1 || d > 30);
	}
	
	public void setMjesec(int m)
	{
		do
		{
			if(m < 1 || m > 12)
			{
				System.out.println("Krivi unos ! Ponovite unos: ");
				m = input.nextInt();
			}
			else
			{
				mjesec = m;
			}
				
		}
		while(m < 1 || m > 12);
	}
	
	public void setGodina(int g)
	{
		godina = g;
	}
	
	public void IzracunajRazliku(Datum d2)
	{
		int dd, mm, gg;
		int datum1 = dan + mjesec * 30 + godina * 360;
		int datum2 = (d2.getDan() + d2.getMjesec() * 30 + d2.getGodina() * 360);
		int razlika = 0;
		
		if(datum2 > datum1)
		{
			razlika = datum2 - datum1;
		}
		else if(datum1 > datum2)
		{
			razlika = datum1 - datum2;
		}
		else
		{
			System.out.println("Upisali ste iste datume");
		}
		
		gg = razlika /360;
		razlika = razlika -(gg * 360);

		mm = razlika /30;
		razlika = razlika -(mm * 30);

		dd = razlika;
		
		System.out.println("Razlika je " + dd + " dana " + mm + " mjeseci " + gg + " godina");

	}

	public static void main(String[] args)
	{
		Datum datum [] = new Datum [2];
		datum[0] = new Datum();
		datum[1] = new Datum();
		
		Scanner input = new Scanner(System.in);
		int day, month, year;
		
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Upisite " + (i+1) + ". datum");
			
			System.out.println("Upisite dan: ");
			day = input.nextInt();
			datum[i].setDan(day);
			
			System.out.println("Upisite mjesec: ");
			month = input.nextInt();
			datum[i].setMjesec(month);
			
			System.out.println("Upisite godinu: ");
			year = input.nextInt();
			datum[i].setGodina(year);
		}
		
		datum[0].IzracunajRazliku(datum[1]);
		

	}

}
