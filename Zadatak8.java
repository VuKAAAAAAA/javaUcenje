import java.util.Scanner;

public class Zadatak8
{

	public static void main(String[] args)
	{
		  String rijec, obrnutaRijec = ""; 
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Upisi rijec:");  
	      rijec = in.nextLine();   
	      int length = rijec.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         obrnutaRijec += rijec.charAt(i);  
	      if (rijec.equals(obrnutaRijec))  
	         System.out.println("Rijec je polindrom.");
	      else  
	         System.out.println("Rijec nije polindrom.");   
	   }  
	}  
