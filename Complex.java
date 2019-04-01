import java.util.Scanner;

public class Complex
{
	private double imag;
	private double real;

	public Complex(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	public Complex()
	{
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	public static Complex unos()
	{
		Complex kompBr = new Complex();
		Scanner input = new Scanner(System.in);
		System.out.println("Upisi realni broj: ");
		kompBr.real = input.nextDouble();
		System.out.println("Upisi imaginarni broj: ");
		kompBr.imag = input.nextDouble();
		return kompBr;
	}
	
	public static Complex mnozenje(Complex kompBr1, Complex kompBr2)
	{
		Complex rez = new Complex();
		rez.real = (kompBr1.real * kompBr2.real) - (kompBr1.imag * kompBr2.imag);
		rez.imag = (kompBr1.real * kompBr2.imag) + (kompBr1.imag * kompBr2.real);
		return rez;
	}
	
	public static Complex zbrajanje(Complex kompBr1, Complex kompBr2)
	{
		Complex rez = new Complex();
		rez.real = (kompBr1.real + kompBr2.real);
		rez.imag = (kompBr1.imag + kompBr2.imag);
		return rez;
	}
	
	public static Complex oduzimanje(Complex kompBr1, Complex kompBr2)
	{
		Complex rez = new Complex();
		rez.real = (kompBr1.real - kompBr2.real);
		rez.imag = (kompBr1.imag - kompBr2.imag);
		return rez;
	}

	public static void main(String[] args)
	{
		Complex kompBr1 = unos();
		Complex kompBr2 = unos();
		Complex.mnozenje(kompBr1, kompBr2);
		Complex.zbrajanje(kompBr1, kompBr2);
		Complex.oduzimanje(kompBr1, kompBr2);
		Complex rez1 = Complex.zbrajanje(kompBr1, kompBr2);
		System.out.println("Zbroj 2 upisana kompleksna broja je: " + rez1.real + " " + rez1.imag);
		Complex rez2 = Complex.oduzimanje(kompBr1, kompBr2);
		System.out.println("Razlika 2 upisana kompleksna broja je: " + rez2.real + " " + rez2.imag);
		Complex rez3 = Complex.mnozenje(kompBr1, kompBr2);
		System.out.println("Umnozak 2 upisana kompleksna broja je: " + rez3.real + " " + rez3.imag);		
	}
}
