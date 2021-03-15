import java.util.Arrays;
import java.util.Scanner;

public class Modul3Fase4 {

	public static void main(String[] args) {
		
		
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		Scanner  nomCiutat = new Scanner(System.in);

	    System.out.println("Introduiex el nom de la 1ª ciutat");
	    ciutat1 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 2ª ciutat");
	    ciutat2 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 3ª ciutat");
	    ciutat3 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 4ª ciutat");
	    ciutat4 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 5ª ciutat");
	    ciutat5 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 6ª ciutat");
	    ciutat6 = nomCiutat.nextLine();
	    nomCiutat.close();
	    System.out.println(" "); 
	    System.out.println("Les ciutats són: "+ciutat1+" "+ciutat2+" "+ciutat3+" "+ciutat4+" "+ciutat5+" "+ciutat6);
		
	    System.out.println(" "); 
	    String [] arrayCiutat = {ciutat1,ciutat2,ciutat3,ciutat4,ciutat5,ciutat6};
	    for (int i=0;i<arrayCiutat.length;i++) {
	    	System.out.println("La ciutat que està a la posició "+(i)+" al array és : "+arrayCiutat[i]);
	    	}
	    System.out.println(" "); 
	    Arrays.sort(arrayCiutat);
	    for (int i=0;i<arrayCiutat.length;i++) {
	    	System.out.println("L'ordre de les ciutats ordenades alfabeticament és : " + arrayCiutat[i]);
	    }	
	    System.out.println(" "); 
		for (int i=0;i<arrayCiutat.length;i++) {
			System.out.println("Canviem la lletra 'a' pel número 4 : " + arrayCiutat[i].replace('a', '4'));
		}		 
		String[] ArrayCiutatsModificades= new String [arrayCiutat.length]; 
		for (int i=0;i<arrayCiutat.length;i++) {
		ArrayCiutatsModificades[i]= arrayCiutat[i].replace('a','4');
			}
		Arrays.sort(ArrayCiutatsModificades);	 
		System.out.println(" "); 
		System.out.println("Guardem els noms de les ciutats canviades la lletra 'a' pel número 4 a un array nou:");
		for (String j:ArrayCiutatsModificades) {
		System.out.println(j);
		
		}
		System.out.println(" ");
		System.out.println("Mostrem en pantala el Nou Array Invertit:  "); 
	    
		Character [] ArrBarcelona = new  Character [ciutat1.length()];
	    for(int i=0;i<ciutat1.length();i++) {
	    	ArrBarcelona[i]=ciutat1.charAt(i);
	    	 }
	    for(int i=ArrBarcelona.length-1;i>=0;i--) {
	    System.out.print(ArrBarcelona[i]);
	    }
	    System.out.println(" ");
	    Character [] ArrMadrid = new  Character [ciutat2.length()];
	    for(int i=0;i<ciutat2.length();i++) {
	    	ArrMadrid[i]=ciutat2.charAt(i);
	    	 }
	    for(int i=ArrMadrid.length-1;i>=0;i--) {
	    System.out.print(ArrMadrid[i]);
	    } 
	    System.out.println(" ");
	    Character [] ArrValencia = new  Character [ciutat3.length()];
	    for(int i=0;i<ciutat3.length();i++) {
	    	ArrValencia[i]=ciutat3.charAt(i);
	    	 }
	    for(int i=ArrValencia.length-1;i>=0;i--) {
	    System.out.print(ArrValencia[i]);
	    }	
	    System.out.println(" "); 
	    Character [] ArrMalaga = new  Character [ciutat4.length()];
	    for(int i=0;i<ciutat4.length();i++) {
	    	ArrMalaga[i]=ciutat4.charAt(i);
	    	 }
	    for(int i=ArrMalaga.length-1;i>=0;i--) {
	    System.out.print(ArrMalaga[i]);
	    }	 
	    System.out.println(" ");
	    Character [] ArrCadis = new  Character [ciutat5.length()];
	    for(int i=0;i<ciutat5.length();i++) {
	    	ArrCadis[i]=ciutat5.charAt(i);
	    	 }
	    for(int i=ArrCadis.length-1;i>=0;i--) {
	    System.out.print(ArrCadis[i]);
	    } 
	    System.out.println(" ");
	    Character [] ArrSantander = new  Character [ciutat6.length()];
	    for(int i=0;i<ciutat6.length();i++) {
	    	ArrSantander[i]=ciutat6.charAt(i);
	    	 }
	    for(int i=ArrSantander.length-1;i>=0;i--) {
	    System.out.print(ArrSantander[i]);
	    }
	}
	    
		
}


	
	
	
